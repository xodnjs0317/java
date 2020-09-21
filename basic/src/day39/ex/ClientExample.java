package day39.ex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.rmi.UnknownHostException;



public class ClientExample {
	public static void main(String[] args) throws Exception{
		try {
			Socket socket = new Socket("localhost",5001);
			OutputStream os =  socket.getOutputStream();
			
			String filePath = 
					"C:/Temp/searchResult.txt";
			File file = new File(filePath);
			
			byte[] bytes = new byte[100];
			
			String fileName =file.getName();
			 bytes = fileName.getBytes("UTF-8");
			 os.write(bytes);
			 os.flush();
			System.out.println("[파일 보내기 시작]"+fileName);
			String originalFileName = "C:/Temp/searchResult.txt";
			
			FileInputStream fis = new FileInputStream(originalFileName);
			
			
			int readByteNo;
			byte[]readBytes = new byte[100];
			while((readByteNo =fis.read(readBytes)) !=-1) {
				os.write(readBytes,0,readByteNo);
			}
			os.flush();
			System.out.println("[파일 보내기 완료]");
			
			fis.close();
			os.close();
			socket.close();
			
		}catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
