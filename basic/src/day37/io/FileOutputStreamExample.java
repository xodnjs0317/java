package day37.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) throws Exception{
		String originalFileName = "D:\\JAVA01\\basic\\src\\day37\\io\\fun.jpeg";
		
		String targetFileName = "C:/Temp/fun.jpeg";
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while((readByteNo = fis.read(readBytes))!=-1) {
			fos.write(readBytes,0,readByteNo);
		}
		
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("복사가 잘되었습니다.");
		
	}
}
