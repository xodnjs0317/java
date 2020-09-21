package day39.network;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
			while(true) {
				System.out.println("[���� ��ٸ�]");
				Socket socket = serverSocket.accept();//Ŭ���̾�Ʈ ���� ���� �޼ҵ�
				//accept() �޼ҵ� �����߿��� ���ŷ�Ǿ� �ƹ��͵� �����Ű�� �ʰ� ��ٸ��� ���°� �˴ϴ�.
				InetSocketAddress isa = 
						(InetSocketAddress)socket.getRemoteSocketAddress();
				System.out.println("[���� ������]" + isa.getHostName());
				System.out.println("[���� ������]" + isa.getAddress());
				System.out.println("[���� ������]" + isa.getHostString());

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
