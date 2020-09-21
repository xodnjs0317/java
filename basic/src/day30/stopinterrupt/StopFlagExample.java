package day30.stopinterrupt;

public class StopFlagExample {
	public static void main(String[] args) {
		PrintThread1 printThread = new PrintThread1();
		printThread.start();
		try {Thread.sleep(1000);} catch(InterruptedException e) {}
		
		printThread.setStop(true);  // 스레드를 종료시키기 위해 stop필드를 true로변경
	}

}
