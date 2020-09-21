package day38.io2;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {
	public static void main(String[] args) throws Exception{
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		//Reader reader = new InputStreamReader(InputStream input) 생성자를 통해서 InputStream Reader로 바꿔줄수있습니다.
		
		int readCharNo;
		char[] cbuf = new char[100];
		while ((readCharNo = reader.read(cbuf))!=-1) {
			String data = new String(cbuf,0,readCharNo);
			System.out.println(data);
		}
		reader.close();
	}

}
