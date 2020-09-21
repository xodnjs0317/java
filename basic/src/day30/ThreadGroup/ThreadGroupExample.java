package day30.ThreadGroup;

public class ThreadGroupExample {
	public static void main(String[] args) {
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		//스레드 그룹 일므을 mygroup으로 생성
		
		//mygroup에 workthread1,worthread2추가
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[main 스레드 그룹의 list() 메소드 출력 내용]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		
		mainGroup.list();
		System.out.println();
		
		try { Thread.sleep(3000);} catch(InterruptedException e) {}
		System.out.println("[myGroup 스레드 그룹의 interrupt() 메소드 호출");
		myGroup.interrupt(); //mygroup 전체에 interrupt() 명령
	}
		
	}

