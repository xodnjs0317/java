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
				System.out.println("[연결 기다림]");
				Socket socket = serverSocket.accept();//클라이언트 연결 수락 메소드
				//accept() 메소드 실행중에는 블로킹되어 아무것도 실행시키지 않고 기다리는 상태가 됩니다.
				InetSocketAddress isa = 
						(InetSocketAddress)socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함]" + isa.getHostName());
				System.out.println("[연결 수락함]" + isa.getAddress());
				System.out.println("[연결 수락함]" + isa.getHostString());

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
