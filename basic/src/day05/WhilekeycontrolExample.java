package day05;

public class WhilekeycontrolExample {
	public static void main(String[] args)throws Exception {
		
		int speed = 0;
		int keyCode = 0;
		
		boolean run = true;
		
		while(run) {
			if(keyCode!= 13 && keyCode!=10) {
				System.out.println("----------------");
				System.out.println("1.����|2.����|3.����");
				System.out.println("����:");
			}
			keyCode = System.in.read();
			System.out.println(keyCode);
			
			if(keyCode==49) {//1�� �о������
				speed++;
				System.out.println("����ӵ�="+speed);
				
			} else if(keyCode==50) {
				speed--;
				System.out.println("����ӵ�="+speed);
			} else if(keyCode==51) { //3�� �о��� ���
				run = false;
			}	
		}
				System.out.println("���α׷�����");
	}
	
}
