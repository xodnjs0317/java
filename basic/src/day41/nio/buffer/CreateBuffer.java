package day41.nio.buffer;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

public class CreateBuffer {
	public static void main(String[] args) {
		ByteBuffer byteBuffer = ByteBuffer.allocate(100*1024*1024);
		CharBuffer charBuffer = CharBuffer.allocate(100);
		//allocate �޼ҵ�� Ÿ�Ժ��� ����̷�Ʈ ���۸� �����ϴ� �޼ҵ��Դϴ�.
		
		byte[] byteArray = new byte[100];
		ByteBuffer byteBuffer2 = ByteBuffer.wrap(byteArray);
		char[] charArray = new char[100];
		CharBuffer charBuffer2 = CharBuffer.wrap(charArray);
		//wrap�޼ҵ�� �̹� �����Ǿ��ִ� �ڹ� �迭�� �̿��ؼ� buffer ��ü�� �����Ѵ�.
		
		byte[] byteArray2 = new byte[100];
		ByteBuffer byteBuffer3 = ByteBuffer.wrap(byteArray,0,50);
		//wrap �޼ҵ��� �迭�� ��� �����Ͱ� �ƴ϶� �Ϻ� �����͸����ε� buffer ��ü�� �����Ҽ� �ֽ��ϴ�.
		
		char[] charArray2 = new char[100];
		CharBuffer charBuffer3 = CharBuffer.wrap("NIO ������� ���۸� �̿��մϴ�.");
		//charbufferwrap �޼ҵ忡�� ���ڿ��� charbuffer�� �����Ҽ��� �ֽ��ϴ�.
		
		
		//allocateDirect �޼ҵ�� bytebvuffer���� �����Ǳ� ������ �� Ÿ�Ժ��� ���̷�Ʈ ���۸� 
		//�����ϰ� �ʹٸ� �켱 bytebuffer�� allocatedirect�޼ҵ�� ���۸� ������ ������ 
		//��ȯ �޼ҵ带 �̿��ؼ� �ش� Ÿ�Ժ� buffer�� ������ �ȴ�.
		ByteBuffer byteBuffer4 = ByteBuffer.allocateDirect(100);
		
		CharBuffer charBuffer4 = ByteBuffer.allocateDirect(100).asCharBuffer();
		//50���� char���� ����
		
		IntBuffer intBuffer = ByteBuffer.allocateDirect(100).asIntBuffer();
		//25���� int���� ����
		
	}
}
