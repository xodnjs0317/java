package day37.io;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {
	public static void main(String[] args) throws Exception{
		File file = new File("C:/Temp/file.txt");
		FileWriter fw = new FileWriter(file , true);
		
		//new FileWriter(file,true) �������� ��� �Ű������� true�� �߰� �Ǹ�
		//������ �����Ұ�� ������ ����� �ʰ� �ڿ� ������ �߰��մϴ�.
		//new FileWriter(file) - ������ �����ص� ������ ���� ���� �����Ե˴ϴ�.
		
		//File file = new File("C:/Temp/file.txt");
		//FileWriter fw = new FileWriter(file , true);
		//FileWriter fw = new FileWriter("C:/Temp/file.txt", true);
		
		
		fw.write("FileWriter�� �ѱ۷ε� "+"\r\n");
		fw.write("���ڿ��� �ٷ� ����� �� �ִ�."+"\r\n"); 	//\r ĳ���� ������ Ŀ���� ���� �Ǿ����� �̵���ŵ�ϴ�.   
		fw.write("�ѽöѽ� "+"\n");				// \n �����ǵ�
		fw.flush();
		fw.close();
		System.out.println("���Ͽ� ����Ǿ����ϴ�.");
	}
}
