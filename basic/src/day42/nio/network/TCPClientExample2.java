package day42.nio.network;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;

public class TCPClientExample2 {
	public static void main(String[] args) {
		SocketChannel socketChannel = null;
		try {
			socketChannel = SocketChannel.open();
			socketChannel.configureBlocking(true);
			System.out.println("���� ��û");
			socketChannel.connect(new InetSocketAddress("localhost",5001));
			System.out.println("���� ����");
			
			ByteBuffer byteBuffer = null;
			Charset charset = Charset.forName("UTF-8");
			
			byteBuffer = charset.encode("Hello Server");
			socketChannel.write(byteBuffer);
			System.out.println("������ ������ ����");
			
			byteBuffer = ByteBuffer.allocate(100);
			int byteCount = socketChannel.read(byteBuffer);
			byteBuffer.flip();
			String message = charset.decode(byteBuffer).toString();
			System.out.println("������ �ޱ� ���� : "+message);
		} catch(Exception e) {}
		
		if(socketChannel.isOpen()) {
			try {
				socketChannel.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
