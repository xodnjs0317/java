package day40.chatting;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;



public class ServerExample extends Application{

	ExecutorService executorService;
	List<Client> connections = new Vector<Client>();
	ServerSocket serverSocket;
	void startServer() {
		executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress(5001));
		} catch(Exception e) {
			if(serverSocket.isClosed()) {stopServer();}
			return;
		}
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					Platform.runLater(()-> {
						displayText("[��������]");
						btnStartStop.setText("stop");
					}
					);
					while(true) {
						try {
							Socket socket = serverSocket.accept();
							String message = "[������� :"+ socket.getRemoteSocketAddress()+":"+ Thread.currentThread().getName()+"]";
							
							Client client = new Client(socket);
							connections.add(client);
							Platform.runLater(()->displayText(message));
							Platform.runLater(()->displayText("[���ᰳ�� : "+connections.size()+"]"));
						}catch(Exception e) {
							e.printStackTrace();
							if(!serverSocket.isClosed()) stopServer();
						}
					}
				}
			};
			executorService.submit(runnable);
	}
	void stopServer() {
		try {
			Iterator<Client> iterator = connections.iterator();
			while(iterator.hasNext()) {
				Client client = iterator.next();
				iterator.remove();
				//Iterator�� remove �� �÷��� �����ӿ�ũ�� ���� ���� �����ϰ� �������ݴϴ�. list�� ��� �ݴϴ�.
			}
			if(serverSocket!=null&!serverSocket.isClosed()) {
				serverSocket.close();
			}
			if(executorService!=null&&!executorService.isShutdown()) {
				
			}
			Platform.runLater(()-> {
				displayText("[���� ����]");
				btnStartStop.setText("start");
			});
		}catch(Exception e) {
			
		}
	}
	
	class Client{
		Socket socket;
		Client(Socket socket){
			this.socket=socket;
			receive();
		}
		void receive() {
			Runnable runnable = new Runnable() {

				@Override
				public void run() {
					try {
						while(true) {
							byte[] byteArr = new byte[100];
							InputStream inputStream = socket.getInputStream();
							int readByteCount = inputStream.read(byteArr);
							
							if(readByteCount== -1) {throw new IOException();}
								String message = "[��ûó�� : "+ socket.getRemoteSocketAddress()+":"+Thread.currentThread().getName()+"]";
								
								Platform.runLater(()-> displayText(message));
								
								String data = new String(byteArr,0,readByteCount,"UTF-8");
							
								for(Client client : connections ) {
									client.send(data);
								}
						}
					} catch(Exception e) {
						
						connections.remove(Client.this);
						String message = "[Ŭ���̾�Ʈ ��žȵ� : " +socket.getRemoteSocketAddress()+":"+Thread.currentThread().getName()+"]";
						Platform.runLater(()-> displayText(message));
						try {
							socket.close();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
//						e.printStackTrace();
					}
				}
				
			};
			executorService.submit(runnable);
		}
		void send(String data) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					try {
						byte[] byteArr = data.getBytes("UTF-8");
						OutputStream outputStream = socket.getOutputStream();
						outputStream.write(byteArr);
						outputStream.flush();
						
					} catch (Exception e) {
						try {
							String message = "[Ŭ���̾�Ʈ ��� �ȵ� :" + socket.getRemoteSocketAddress()+":"+Thread.currentThread().getName()+"]";
							Platform.runLater(()-> displayText(message));
							connections.remove(Client.this);
							socket.close();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						e.printStackTrace();
					}
				}
			};
			executorService.submit(runnable);
		}
	}
	TextArea txtDisplay;
	Button btnStartStop;

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		root.setPrefSize(700, 600);
		
		txtDisplay =  new TextArea();
		txtDisplay.setEditable(true);
		BorderPane.setMargin(txtDisplay, new Insets(0,0,2,0));
		root.setCenter(txtDisplay);
		
		btnStartStop = new Button("start");
		btnStartStop.setPrefHeight(30);
		btnStartStop.setMaxWidth(Double.MAX_VALUE);
		
		btnStartStop.setOnAction(e-> {
			if(btnStartStop.getText().equals("start")) {
				startServer();
			}else if(btnStartStop.getText().equals("stop")) {
				stopServer();
			}
		});
		root.setBottom(btnStartStop);
		
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().
				getResource("app.css").toString());
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("����");
		primaryStage.setOnCloseRequest(event->stopServer());
		primaryStage.show();
		
	}
	//javafx �޼ҵ� ����
	void displayText(String text) {
		txtDisplay.appendText(text + "\n");
	}
	
	//�����ڵ�
	public static void main(String[] args) {
		launch(args);
	}

	

}
