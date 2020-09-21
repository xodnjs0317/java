package day37.io;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws Exception{
		File dir = new File("C:/Temp/Dir");
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File(new URI("file:///C:/Temp/file3.txt"));
		
		if(dir.exists()==false) {dir.mkdir();}
		if(file1.exists()==false) {file1.createNewFile();}
		if(file2.exists()==false) {file2.createNewFile();}
		if(file3.exists()==false) {file3.createNewFile();}
		
		File temp = new File("C:/Temp");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		File[] contents = temp.listFiles();
		System.out.println("��¥\t�ð�\t����\tũ��\t�̸�");
		System.out.println("----------------------------------------------");
		for(File file : contents) {
			System.out.println(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.println("\t<DIR>\t\t\t"+file.getName());
			} else {
				System.out.println("\t\t\t"+file.length()+"\t"+file.getName());
			}
			System.out.println();
		}
		
	}
}
