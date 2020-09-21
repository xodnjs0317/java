package day29.Thread;

public class ThreadC extends Thread{
	public boolean stop = false; //종료 플래그
	public boolean work = true;
	
	public void run() {
		while(!stop) {	//STOP이 TRUE가 되면 WHILE문 종료
			if(work) {
				System.out.println("ThreadC 작업 내용");
			}else {
				Thread.yield();	//WORK가 FALSE가 되면 다른 스레드에게실행 양보
			}
		}
		System.out.println("ThreadA 종료");
	}

}
