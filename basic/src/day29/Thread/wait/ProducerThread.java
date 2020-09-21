package day29.Thread.wait;

public class ProducerThread extends Thread{
	private DateBox dataBox;
	
	public ProducerThread(DateBox dataBox) {
		this.dataBox = dataBox;
	}
	@Override
	public void run() {
		for(int i=1;i<=3;i++) {
			String data ="Data-" +i;
			dataBox.setData(data);
		}
	}
	

}
