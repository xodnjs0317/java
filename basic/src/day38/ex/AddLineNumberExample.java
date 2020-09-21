package day38.ex;


import java.io.BufferedReader;
import java.io.FileReader;


public class AddLineNumberExample {
	public static void main(String[] args) throws Exception{
		
		String filePath = ("D:\\JAVA01\\basic\\src\\day25\\EqulasExample.java"); // 파일경로를 쓰세요.
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		int rowNumber = 0;
		String rowData; 
		while((rowData = br.readLine()) != null) {
			// readLine()으로 한 줄씩 읽어오기(null이 될 때까지)
			System.out.println(++rowNumber + " : " + rowData);  // 라인 번호 1부터 출력
	}
	br.close();	
	}
	
}

