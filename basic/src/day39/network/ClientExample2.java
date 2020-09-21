package day39.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample2 {
	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket();
			System.out.println("[���� ��û]");
			socket.connect(new InetSocketAddress("10.5.5.0",5001));
			System.out.println("[���� ����]");
			
			byte[] bytes = null;
			String message = null;
			
			OutputStream os = socket.getOutputStream();
			message = "Hello Server";
			bytes = message.getBytes("UTF-8"); 
			//Hello Server�� UTF-8�� ���ڵ��� ����Ʈ �迭�� �����ϴ�. 
			os.write(bytes);
			os.flush();
			System.out.println("[������ ������ ����]");
			
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			int readByteCount = is.read(bytes);
			message = new String(bytes, 0,readByteCount,"UTF-8");
			//UTF-8�� ���ڵ��� �޼����� ���ڵ��ؼ� String ��ü�� �־��ݴϴ�. 
			System.out.println("[������ �ޱ� ����] : " + message);
			os.close();
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
