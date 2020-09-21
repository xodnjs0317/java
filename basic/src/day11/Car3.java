package day11;

public class Car3 {
	String model;
	int speed;
	
	Car3(String model) {
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed=speed;
	}
	void run() {
		for(int i = 10; i <=50;i++) {
			this.setSpeed(i);
			System.out.println(this.model+"가달립니다.+ (시속:"+this.speed+"km/h");
		}
	}
}
