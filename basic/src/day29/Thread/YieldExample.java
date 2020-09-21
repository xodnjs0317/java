package day29.Thread;

public class YieldExample {
	public static void main(String[] args) {
		ThreadC threadC = new ThreadC();
		ThreadD threadD = new ThreadD();
		
		threadC.start();
		threadD.start();
		
		try {Thread.sleep(3000);}catch(InterruptedException e ){}
		threadC.work = false;		//ThreadD만 실행
		
		try {Thread.sleep(3000);}catch(InterruptedException e ){}
		threadC.work = true;		//ThreadD와C 모두 실행
		
		try {Thread.sleep(3000);}catch(InterruptedException e ){}
		threadC.work = true;		//ThreadC 와D 종료
		threadD.work = true;		
	}
}
