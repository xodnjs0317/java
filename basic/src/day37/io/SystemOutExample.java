package day37.io;

import java.io.OutputStream;
//import java.io.PrintStream;

public class SystemOutExample {
	public static void main(String[] args) throws Exception{
	OutputStream os = System.out;
	
	for(byte b =48; b<58; b++) {
		os.write(b);
	}
	os.write(10);		//라인 피드를 출력하면 다음 행으로 넘어감
	
	for(byte b =97; b<123; b++) {
		os.write(b);
	}
	os.write(10);
	
	String hangul = "가나다라마바사아자차카타파하";
	byte[] hangulBytes = hangul.getBytes();
	//한글을 2바이트로 표시되기 때문에
	//1바이트로 넣을수 없어서 바이트 배열로 한글을 받아줍니다.
	os.write(hangulBytes);
	
	os.flush();
	
//	PrintStream ps = System.out;
//	ps.println("...");
	}
	
}
