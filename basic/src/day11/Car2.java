package day11;

public class Car2 {
	int speed;
	
	
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
	void run() {
		for(int i =10; i<=50;i++) {
			speed = i;
			System.out.println("달립니다(시속:"+speed+"km/h");
		}
	}
}
