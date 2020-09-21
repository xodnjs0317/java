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
		//부모폴더를 모두 생성
		
		
		FileInputStream fis = new FileInputStream("c:/Temp");
		FileChannel fileChannel10 = fis.getChannel();
		//FileChannel 은 fileinputstream 이나 fileoutputstream getchannel메소드를 통해서얻거나
		
		FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.CREATE,StandardOpenOption.WRITE);
		//open 메소드를 통해서 얻을수도 있습니다.
		//create 파일이 없으면 새로 생성합니다.
		//write 쓰기용으로 파일을 엽니다.
		//read 읽기용으로 파일을 엽니다.
		//create_new 새파일을 만든다. 이미 파일이 있으면 예외와 함께실패
		//append 파일 끝에 새로운 데이터를 추가 합니다. (write나 create와 함께사용)
		//delete_on_close 패널을 닫을때 파일을 삭제합니다. (임시파일 삭제용)
		//truncate_existing 파일을 0바이트로 잘라냅니다. (write 옵션과함께사용)
		String data = "안녕하세요";
		Charset charset = Charset.defaultCharset();
		ByteBuffer byteBuffer = charset.encode(data);
		
		int byteCount = fileChannel.write(byteBuffer);
		System.out.println("file.txt: " + byteCount + "bytes written");
		
		
		fileChannel.close();
	}
}
