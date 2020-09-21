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
			System.out.println("[연결 요청]");
			socket.connect(new InetSocketAddress("10.5.5.0",5001));
			System.out.println("[연결 성공]");
			
			byte[] bytes = null;
			String message = null;
			
			OutputStream os = socket.getOutputStream();
			message = "Hello Server";
			bytes = message.getBytes("UTF-8"); 
			//Hello Server를 UTF-8로 인코딩한 바이트 배열을 얻어냅니다. 
			os.write(bytes);
			os.flush();
			System.out.println("[데이터 보내기 성공]");
			
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			int readByteCount = is.read(bytes);
			message = new String(bytes, 0,readByteCount,"UTF-8");
			//UTF-8로 인코딩된 메세지를 디코딩해서 String 객체에 넣어줍니다. 
			System.out.println("[데이터 받기 성공] : " + message);
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
