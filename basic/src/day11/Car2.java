package day11;

public class Car2 {
	int speed;
	
	
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("Ű�� �����ϴ�.");
	}
	void run() {
		for(int i =10; i<=50;i++) {
			speed = i;
			System.out.println("�޸��ϴ�(�ü�:"+speed+"km/h");
		}
	}
}
