package day42.nio.network;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class TCPServerExample {
	public static void main(String[] args) {
		ServerSocketChannel serverSocketChannel = null;
		
		try {
			serverSocketChannel = ServerSocketChannel.open();
			serverSocketChannel.configureBlocking(true);
			serverSocketChannel.bind(new InetSocketAddress(5001));
			while(true) {
				System.out.println("�����ٸ�");
				SocketChannel socketChannel = serverSocketChannel.accept();
				InetSocketAddress isa = (InetSocketAddress) socketChannel.getRemoteAddress();
				System.out.println("���� ������ "+ isa.getHostName());
			}
		} catch (IOException e) {}
		if(serverSocketChannel.isOpen()) {
			try {
				serverSocketChannel.close();
			}catch (IOException e1) {}
		}
		 
	}
}
