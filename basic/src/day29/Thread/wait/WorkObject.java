package day29.Thread.wait;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA() 작업 실행");
		
		notify(); 		//일시정지상태에있는 다른스레드를 실행 대기 상태를 만드는 메소드
		try {
			wait();		// 자신을 일시정지 상태로 만드는 메소드
		}catch(InterruptedException e) {
			
		}
		
	}
	public synchronized void methodB() {
		System.out.println("ThreadB의 methodB() 작업 실행");
		notify();
		try {
			wait();
		} catch(InterruptedException e) {
			
		}
	}
}
