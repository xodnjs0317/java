package day30.ex;

public class ThreadExample2 {
	public static void main(String[] args) {
		Thread thread = new MovieThread2();
		thread.setDaemon(true);
		thread.start();
		
		try {Thread.sleep(3000);} catch(InterruptedException e) {}
		
		thread.interrupt();
	}
}
