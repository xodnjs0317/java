package day30.ex;

public class RaceGame {
	public static void main(String[] args) {
		Hores h1 = new Hores("1��");
		Hores h2 = new Hores("2��");
		Hores h3 = new Hores("3��");
		Hores h4 = new Hores("4��");
		System.out.println("���ָ� �����մϴ�.");
		h1.setPriority(Thread.MAX_PRIORITY);
		
		h1.start();
		h2.start();
		h3.start();
		h4.start();
		try {
			h1.join();
			h2.join();
			h3.join();
			h4.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("���ְ� ���� �Ǿ����ϴ�.");
		
		
	}
}
