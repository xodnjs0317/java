package day29.Thread.wait;

public class WaitNotifyExample {
	public static void main(String[] args) {
		WorkObject sharedObject = new WorkObject(); //���� ��ü ����
		
		ThreadA threadA = new ThreadA(sharedObject);	//ThreadA��ThreadB����
		ThreadB threadB = new ThreadB(sharedObject);
		
		threadA.start();
		threadB.start();
	}
}
