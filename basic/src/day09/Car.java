package day09;

public class Car {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	//생성자는 객체를 생성할때 자동으로 실행되는 메소드입니다.
	
	Car() {
		
	}
	Car(String model) {
		this.model = model;
	}
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
