package day37.io;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("c:/Temp/person.txt");
			int data;
			
			while((data =fis.read())!=-1) {
				System.out.write(data);
			}
			fis.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
