package day29.Thread;

public class YieldExample {
	public static void main(String[] args) {
		ThreadC threadC = new ThreadC();
		ThreadD threadD = new ThreadD();
		
		threadC.start();
		threadD.start();
		
		try {Thread.sleep(3000);}catch(InterruptedException e ){}
		threadC.work = false;		//ThreadD�� ����
		
		try {Thread.sleep(3000);}catch(InterruptedException e ){}
		threadC.work = true;		//ThreadD��C ��� ����
		
		try {Thread.sleep(3000);}catch(InterruptedException e ){}
		threadC.work = true;		//ThreadC ��D ����
		threadD.work = true;		
	}
}
