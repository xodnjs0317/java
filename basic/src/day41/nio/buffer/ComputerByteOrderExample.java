package day41.nio.buffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class ComputerByteOrderExample {
	public static void main(String[] args) {
		System.out.println("�ü�� ���� :" + System.getProperty("os.name") );
		System.out.println("����Ƽ���� ����Ʈ �ؼ� ���� :"+ByteOrder.nativeOrder());
		//�ڹٴ� �⺻������ big ending���� �����ϵ��� �Ǿ��ֽ��ϴ�.
		
		
		ByteBuffer byteBuffer = ByteBuffer.allocateDirect(100).order(ByteOrder.nativeOrder());
		//�ü���� JVM�� ����Ʈ �ؼ� ������ �ٸ���� ���̷�Ʈ ������ ��쿡�� �ü���� native I/O�� 
		//����ϹǷ� �ü���� �⺻ �ؼ� ������ JVM�� �ؼ������� ���ߴ°��� ���ɿ� ������ �ȴ�.
		//order() �޼ҵ带 ���ؼ�matoveOrder�� ���ϰ����� �������ָ� �ȴ�.
	}
}
