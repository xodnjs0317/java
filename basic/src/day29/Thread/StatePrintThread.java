package day29.Thread;

public class StatePrintThread extends Thread{
	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState();
			System.out.println("타겟 스레드 상태 :"+ state);
			
			if(state == Thread.State.NEW) {
				//new는 객체가 생성후에 start()가 실행되지 않은경우
				targetThread.start();
			}
			if(state == Thread.State.TERMINATED) {
				//terminated는 실행을 마친상태
				break;
			}try {Thread.sleep(500);}
			catch(Exception e) {}
		}
		//RUNNABLE  - 실행 상태로 언제든지 갈수 있는상태 START()메소드가 실행된상태 
		//---------기다리는상태--------
		//WAITING  	- 다른 스레드가 통지할때까지 기다리는상태
		//TIMED_WAITING	- 주어진 시간동안 기다리는 상태
		//BLOCKED		- 사용하고자 하는 객체의 락이 풀릴 때까지 기다리는 상태
	}

}
