package day30.ex;

public class MovieThread extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("�������� ����մϴ�.");
			if(Thread.interrupted()) {
				break;
			}
			
		}
		System.out.println("�������� �����մϴ�.");
}
}