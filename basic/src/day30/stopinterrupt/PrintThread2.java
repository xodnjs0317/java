package day30.stopinterrupt;

public class PrintThread2 extends Thread{
	public void run() {
////		try {
////			 while(true) {
////				 System.out.println("실행 중");
////				 Thread.sleep(1);
////			 }
////		} catch(InterruptedException e) {
////			//예외발생시 실행구간
//		
//		}
		while(true) {	//thrad.sleep을 사용하거나 혹은 thread.interrupted()를 사용해서  interrupt가 발생헀는지 확인할수 있습니다.
			System.out.println("실행중");
			if(Thread.interrupted()) {
				break;
			}
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
		
	}
	
}
