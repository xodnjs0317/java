package day09;

public class Car2 {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	//생성자는 객체를 생성할때 자동으로 실행되는 메소드입니다.
	
	Car2() {
		//this.model = model;
		//this.color = color;
		//this.maxSpeed = maxSpeed;
		//3줄을 써야 하는 코드를 생성자를 호출함으로써 한줄로 줄일수 있다.
	}
	Car2(String model) {
		this(model,"은색",250);
	}
	Car2(String model, String color) {
		this(model,color,250);
	}
	Car2(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
}
}