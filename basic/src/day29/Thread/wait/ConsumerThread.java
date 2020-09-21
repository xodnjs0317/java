package day29.Thread.wait;

public class ConsumerThread extends Thread{
		private DateBox dataBox;
		
		public ConsumerThread(DateBox dataBox) {
			this.dataBox = dataBox;
		}
	@Override
	public void run() {
		for(int i =1; i<=3;i++) {
			String data = dataBox.getData();
		}
	}

}
