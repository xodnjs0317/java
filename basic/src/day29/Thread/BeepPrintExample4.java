package day29.Thread;

public class BeepPrintExample4 {
	public static void main(String[] args) {
		Thread thread = new BeepThread();
		thread.start();
		
		for(int i =0;i<5;i++) {
			System.out.println("��");
			try {Thread.sleep(500);}
			catch(Exception e ) {}
		}
	}
}
