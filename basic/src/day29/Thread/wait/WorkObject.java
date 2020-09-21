package day29.Thread.wait;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA�� methodA() �۾� ����");
		
		notify(); 		//�Ͻ��������¿��ִ� �ٸ������带 ���� ��� ���¸� ����� �޼ҵ�
		try {
			wait();		// �ڽ��� �Ͻ����� ���·� ����� �޼ҵ�
		}catch(InterruptedException e) {
			
		}
		
	}
	public synchronized void methodB() {
		System.out.println("ThreadB�� methodB() �۾� ����");
		notify();
		try {
			wait();
		} catch(InterruptedException e) {
			
		}
	}
}
