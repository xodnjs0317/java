package day37.io;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {
	public static void main(String[] args) throws Exception{
		File file = new File("C:/Temp/file.txt");
		FileWriter fw = new FileWriter(file , true);
		
		//new FileWriter(file,true) 생성자의 경우 매개변수로 true가 추가 되면
		//파일이 존재할경우 파일을 덮어쓰지 않고 뒤에 내용을 추가합니다.
		//new FileWriter(file) - 파일이 존재해도 파일을 새로 만들어서 덮어씌우게됩니다.
		
		//File file = new File("C:/Temp/file.txt");
		//FileWriter fw = new FileWriter(file , true);
		//FileWriter fw = new FileWriter("C:/Temp/file.txt", true);
		
		
		fw.write("FileWriter는 한글로된 "+"\r\n");
		fw.write("문자열을 바로 출력할 수 있다."+"\r\n"); 	//\r 캐리지 리턴은 커서를 그줄 맨앞으로 이동시킵니다.   
		fw.write("뚜시뚜시 "+"\n");				// \n 라인피드
		fw.flush();
		fw.close();
		System.out.println("파일에 저장되었습니다.");
	}
}
