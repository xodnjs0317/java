package day38.ex;


import java.io.BufferedReader;
import java.io.FileReader;


public class AddLineNumberExample {
	public static void main(String[] args) throws Exception{
		
		String filePath = ("D:\\JAVA01\\basic\\src\\day25\\EqulasExample.java"); // ���ϰ�θ� ������.
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		int rowNumber = 0;
		String rowData; 
		while((rowData = br.readLine()) != null) {
			// readLine()���� �� �پ� �о����(null�� �� ������)
			System.out.println(++rowNumber + " : " + rowData);  // ���� ��ȣ 1���� ���
	}
	br.close();	
	}
	
}

