package day29.Thread;

public class ThreadD extends Thread{
	public boolean stop = false; //���� �÷���
	public boolean work = true;
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadD �۾� ����");
			}else {
				Thread.yield();
			}
		}
		System.out.println("ThreadD ����");
	}

}
