package day08;

public class CarExample {
	public static void main(String[] args) {
		//객체 생성
		Car myCar = new Car();
		
		//필드값 읽기
		System.out.println("제작회사:" + myCar.company);
		System.out.println("제작회사:" + myCar.model);
		System.out.println("제작회사:" + myCar.color);
		System.out.println("제작회사:" + myCar.maxSpeed);
		System.out.println("제작회사:" + myCar.speed);
		
		myCar.speed = 60;
		System.out.println("수정된 속도 : "+ myCar.speed);
	}
}
