package day29.Thread;

public class ThreadC extends Thread{
	public boolean stop = false; //���� �÷���
	public boolean work = true;
	
	public void run() {
		while(!stop) {	//STOP�� TRUE�� �Ǹ� WHILE�� ����
			if(work) {
				System.out.println("ThreadC �۾� ����");
			}else {
				Thread.yield();	//WORK�� FALSE�� �Ǹ� �ٸ� �����忡�Խ��� �纸
			}
		}
		System.out.println("ThreadA ����");
	}

}
