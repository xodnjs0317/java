package day29.Thread;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		
		//�� �ڵ带 �����ϴ� ������ ��ü�� ��� �żҵ�
		System.out.println("���α׷� ���� ������ �̸� :"+ mainThread.getName());
				
		ThreadA threadA = new ThreadA();
		System.out.println("�۾� ������ �̸� : "+threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("�۾� ������ �̸� : "+ threadB.getName());
		threadB.start();
		
	}
}
