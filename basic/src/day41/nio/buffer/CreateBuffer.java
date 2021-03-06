package day41.nio.buffer;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

public class CreateBuffer {
	public static void main(String[] args) {
		ByteBuffer byteBuffer = ByteBuffer.allocate(100*1024*1024);
		CharBuffer charBuffer = CharBuffer.allocate(100);
		//allocate 메소드는 타입별로 논다이렉트 버퍼를 생성하는 메소드입니다.
		
		byte[] byteArray = new byte[100];
		ByteBuffer byteBuffer2 = ByteBuffer.wrap(byteArray);
		char[] charArray = new char[100];
		CharBuffer charBuffer2 = CharBuffer.wrap(charArray);
		//wrap메소드는 이미 생성되어있는 자바 배열을 이용해서 buffer 객체를 생성한다.
		
		byte[] byteArray2 = new byte[100];
		ByteBuffer byteBuffer3 = ByteBuffer.wrap(byteArray,0,50);
		//wrap 메소도는 배열의 모든 데이터가 아니라 일부 데이터만으로도 buffer 객체를 생성할수 있습니다.
		
		char[] charArray2 = new char[100];
		CharBuffer charBuffer3 = CharBuffer.wrap("NIO 입출력은 버퍼를 이용합니다.");
		//charbufferwrap 메소드에서 문자열로 charbuffer를 생성할수도 있습니다.
		
		
		//allocateDirect 메소드는 bytebvuffer에만 제공되기 때문에 각 타입별로 다이렉트 버퍼를 
		//생성하고 싶다면 우선 bytebuffer의 allocatedirect메소드로 버퍼를 생성한 다음에 
		//변환 메소드를 이용해서 해당 타입별 buffer를 얻으면 된다.
		ByteBuffer byteBuffer4 = ByteBuffer.allocateDirect(100);
		
		CharBuffer charBuffer4 = ByteBuffer.allocateDirect(100).asCharBuffer();
		//50개의 char값이 저장
		
		IntBuffer intBuffer = ByteBuffer.allocateDirect(100).asIntBuffer();
		//25개의 int값이 저장
		
	}
}
