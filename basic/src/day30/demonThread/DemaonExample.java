package day30.demonThread;

public class DemaonExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		//start()�ϱ����� setDaemon()�� ���� ����ؼ� ���� ������� �������־���մϴ�.
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			
		}
		System.out.println("���� ������ �ΰ��� : "+ autoSaveThread.isDaemon());
		//isdaemon()�� ���󽺷������� �ƴ��� ����� �ִ� �޼ҵ��Դϴ�.
		System.out.println("���� ������ ����");
	}
}
