package day29.ex;

public class MovieThread extends Thread{		
		@Override
		public void run() {
			for(int i = 0; i<3;i++) {
				System.out.println("e�������� ����մϴ�.");
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					
				}
			}
		}
}                          