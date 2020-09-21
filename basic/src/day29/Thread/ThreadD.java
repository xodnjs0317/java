package day29.Thread;

public class ThreadD extends Thread{
	public boolean stop = false; //종료 플래그
	public boolean work = true;
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadD 작업 내용");
			}else {
				Thread.yield();
			}
		}
		System.out.println("ThreadD 종료");
	}

}
