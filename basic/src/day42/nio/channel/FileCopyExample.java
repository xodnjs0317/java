package day42.nio.channel;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;

public class FileCopyExample {
	public static void main(String[] args) throws IOException {
		Path from = Paths.get("src/day42/nio/channel/fun.jpeg");
		Path to = Paths.get("src/day42/nio/channel/fun2.jpeg");
		
		FileChannel fileChannel_from = FileChannel.open(from,StandardOpenOption.READ);
		
		FileChannel fileChannel_to = FileChannel.open(to, StandardOpenOption.CREATE,StandardOpenOption.WRITE);
		
		ByteBuffer buffer = ByteBuffer.allocateDirect(100);
		int byteCount;
		
		while(true) {
			buffer.clear();
			byteCount  = fileChannel_from.read(buffer);
			if(byteCount == -1) break;
			buffer.flip();
			fileChannel_to.write(buffer);
		}
		
		fileChannel_from.close();
		fileChannel_to.close();
		System.out.println("파일복사성공");
		
		Path from2 = Paths.get("src/day42/nio/channel/fun.jpeg");
		Path to2 = Paths.get("src/day42/nio/channel/fun2.jpeg");
		
		Files.copy(from2, to2, StandardCopyOption.REPLACE_EXISTING);
		//REPLACE_EXITING 타겟파일이 존재하면 대체함
		//COPY_ATTRIBUTES 파일의 속성까지 복사
		//NOFOLLOW_LINKS 링크 파일일 경우 링크파일만 복사하고 링크된 파일은 복사하지 않는다.
		System.out.println("파일 복사 완료");
		
	}
}
