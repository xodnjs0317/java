package day23;

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException{
	byte[] bytes = new byte[100];
	
	System.out.println("�Է� :");
	int readByteNo = System.in.read(bytes);
	
	System.out.println("byte�� ���� :" + readByteNo);
	System.out.println(bytes);
	
	String str = new String(bytes, 0, readByteNo-2);
	System.out.println(str);
	}
}
