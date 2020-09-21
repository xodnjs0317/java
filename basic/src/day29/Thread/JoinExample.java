package day29.Thread;

public class JoinExample {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join(); //SUMThread가 종료 할때까지 메인 스레드를 일시정지 시킴
		}catch(InterruptedException e) {
			
		}
		 System.out.println("1~100 합: "+sumThread.getSum());
	}
}
