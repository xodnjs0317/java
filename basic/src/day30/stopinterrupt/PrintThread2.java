package day30.stopinterrupt;

public class PrintThread2 extends Thread{
	public void run() {
////		try {
////			 while(true) {
////				 System.out.println("���� ��");
////				 Thread.sleep(1);
////			 }
////		} catch(InterruptedException e) {
////			//���ܹ߻��� ���౸��
//		
//		}
		while(true) {	//thrad.sleep�� ����ϰų� Ȥ�� thread.interrupted()�� ����ؼ�  interrupt�� �߻������� Ȯ���Ҽ� �ֽ��ϴ�.
			System.out.println("������");
			if(Thread.interrupted()) {
				break;
			}
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
		
	}
	
}
