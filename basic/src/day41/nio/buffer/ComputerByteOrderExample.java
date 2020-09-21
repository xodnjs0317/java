package day41.nio.buffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class ComputerByteOrderExample {
	public static void main(String[] args) {
		System.out.println("운영체제 종류 :" + System.getProperty("os.name") );
		System.out.println("네이티브의 바이트 해석 순서 :"+ByteOrder.nativeOrder());
		//자바는 기본적으로 big ending으로 동작하도록 되어있습니다.
		
		
		ByteBuffer byteBuffer = ByteBuffer.allocateDirect(100).order(ByteOrder.nativeOrder());
		//운영체제와 JVM의 바이트 해석 순서가 다를경우 다이렉트 버퍼일 경우에는 운영체제의 native I/O를 
		//사용하므로 운영체제의 기본 해석 순서로 JVM의 해석순서를 맞추는것이 성능에 도움이 된다.
		//order() 메소드를 통해서matoveOrder의 리턴값으로 생성해주면 된다.
	}
}
