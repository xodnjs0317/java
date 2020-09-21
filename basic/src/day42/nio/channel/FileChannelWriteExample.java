package day42.nio.channel;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileChannelWriteExample {
	public static void main(String[] args) throws IOException{
		Path path = Paths.get("c:/Temp/file.txt");
		Files.createDirectories(path.getParent());
		//�θ������� ��� ����
		
		
		FileInputStream fis = new FileInputStream("c:/Temp");
		FileChannel fileChannel10 = fis.getChannel();
		//FileChannel �� fileinputstream �̳� fileoutputstream getchannel�޼ҵ带 ���ؼ���ų�
		
		FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.CREATE,StandardOpenOption.WRITE);
		//open �޼ҵ带 ���ؼ� �������� �ֽ��ϴ�.
		//create ������ ������ ���� �����մϴ�.
		//write ��������� ������ ���ϴ�.
		//read �б������ ������ ���ϴ�.
		//create_new �������� �����. �̹� ������ ������ ���ܿ� �Բ�����
		//append ���� ���� ���ο� �����͸� �߰� �մϴ�. (write�� create�� �Բ����)
		//delete_on_close �г��� ������ ������ �����մϴ�. (�ӽ����� ������)
		//truncate_existing ������ 0����Ʈ�� �߶���ϴ�. (write �ɼǰ��Բ����)
		String data = "�ȳ��ϼ���";
		Charset charset = Charset.defaultCharset();
		ByteBuffer byteBuffer = charset.encode(data);
		
		int byteCount = fileChannel.write(byteBuffer);
		System.out.println("file.txt: " + byteCount + "bytes written");
		
		
		fileChannel.close();
	}
}
