package day41.nio;

import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;


public class FileSystemExample {
	public static void main(String[] args) throws Exception{
		FileSystem fileSystem = FileSystems.getDefault();
		for(FileStore store : fileSystem.getFileStores()) {
			System.out.println("����̹��� : "+ store.name());
			System.out.println("���Ͻý��� : " + store.type());
			System.out.println("��ü ���� : " + store.getTotalSpace()+ "����Ʈ");
			System.out.println("��� ���� ���� :" + (store.getTotalSpace()- store.getUnallocatedSpace() + "����Ʈ"));
			System.out.println();
		}
		System.out.println("���� ������ : " +fileSystem.getSeparator());
		System.out.println();
		
		for(Path path : fileSystem.getRootDirectories()) {
			System.out.println(path.toString());
		}
	}
}
