package day38.io2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {
	public static void main(String[] args) throws Exception{
		long start =0;
		long end =0;
		
		FileInputStream fis1 = new FileInputStream("D:\\JAVA01\\basic\\src\\day38\\io2\\fun.jpeg");
		
		start =System.currentTimeMillis();
		//	System.currentTimeMillis()�� ���� �ð��� �и� Ÿ������ �о�ɴϴ�.		
		while(fis1.read()!=-1) {}
		end = System.currentTimeMillis();
		System.out.println("������� �ʾ��� �� : "+ (end-start)+"ms");
		fis1.close();
		
		FileInputStream fis2 = new FileInputStream("D:\\JAVA01\\basic\\src\\day38\\io2\\fun.jpeg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		while(bis.read() !=-1) {}
		end = System.currentTimeMillis();
		System.out.println("������� �� :"+(end-start)+"ms");;
		bis.close();
		fis2.close();
		
	}
}
