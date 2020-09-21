package day30.stopinterrupt;

public class PrintThread1 extends Thread{
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	public void run() {
		while(!stop) {
			System.out.println("실행중");
		}
		System.out.println("자원 관리");
		System.out.println("실행 종료");
	}

}
