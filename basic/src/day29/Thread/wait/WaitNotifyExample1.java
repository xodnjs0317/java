package day29.Thread.wait;

public class WaitNotifyExample1 {
	public static void main(String[] args) {
		DateBox dataBox = new DateBox();
		
		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsumerThread consumerThread = new ConsumerThread(dataBox);
		
		producerThread.start();
		consumerThread.start();
		
	}
}
