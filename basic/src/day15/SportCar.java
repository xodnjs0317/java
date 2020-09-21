package day15;

public class SportCar extends Car{

	@Override
	public void speedUp() {
		speed += 10;
	}
//	@Override 부모클래스의 메소드에서 final로 정의 되었기 때문에 오버라이딩 불가
//	public final void stop() {
//		System.out.println("차를 멈춤");
//		speed=0;
//	}
}
