package day29.Thread.wait;

public class WaitNotifyExample {
	public static void main(String[] args) {
		WorkObject sharedObject = new WorkObject(); //傍蜡 按眉 积己
		
		ThreadA threadA = new ThreadA(sharedObject);	//ThreadA客ThreadB积己
		ThreadB threadB = new ThreadB(sharedObject);
		
		threadA.start();
		threadB.start();
	}
}
