package day29.Thread;

public class StatePrintThread extends Thread{
	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState();
			System.out.println("Ÿ�� ������ ���� :"+ state);
			
			if(state == Thread.State.NEW) {
				//new�� ��ü�� �����Ŀ� start()�� ������� �������
				targetThread.start();
			}
			if(state == Thread.State.TERMINATED) {
				//terminated�� ������ ��ģ����
				break;
			}try {Thread.sleep(500);}
			catch(Exception e) {}
		}
		//RUNNABLE  - ���� ���·� �������� ���� �ִ»��� START()�޼ҵ尡 ����Ȼ��� 
		//---------��ٸ��»���--------
		//WAITING  	- �ٸ� �����尡 �����Ҷ����� ��ٸ��»���
		//TIMED_WAITING	- �־��� �ð����� ��ٸ��� ����
		//BLOCKED		- ����ϰ��� �ϴ� ��ü�� ���� Ǯ�� ������ ��ٸ��� ����
	}

}
