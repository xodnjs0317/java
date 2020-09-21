package day39.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample2 {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress(5001));
			while(true) {
				System.out.println("[���� ��ٸ�]");
				Socket socket = serverSocket.accept();
				InetSocketAddress isa = 
						(InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[���� ������] : " + isa.getHostName());
				
				byte[] bytes = null;
				String message = null;
				
				InputStream is = socket.getInputStream();
				bytes = new byte[100];
				int readByteCount = is.read(bytes);
				message = new String(bytes,0,readByteCount, "UTF-8");
				System.out.println("[������ �ޱ� ����] : " + message);
				
				OutputStream os = socket.getOutputStream();
				message = "�������� ";
				bytes = message.getBytes("UTF-8");
				os.write(bytes);
				os.flush();
				System.out.println("[������ ������ ����]");
				is.close(); os.close(); socket.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
