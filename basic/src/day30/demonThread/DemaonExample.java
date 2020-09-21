package day30.demonThread;

public class DemaonExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		//start()하기전에 setDaemon()을 먼저 사용해서 데몬 스레드로 설정해주어야합니다.
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			
		}
		System.out.println("데몬 스레드 인가요 : "+ autoSaveThread.isDaemon());
		//isdaemon()은 데몬스레드인지 아닌지 물어볼수 있는 메소드입니다.
		System.out.println("메인 스레드 종료");
	}
}
