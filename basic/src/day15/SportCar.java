package day15;

public class SportCar extends Car{

	@Override
	public void speedUp() {
		speed += 10;
	}
//	@Override �θ�Ŭ������ �޼ҵ忡�� final�� ���� �Ǿ��� ������ �������̵� �Ұ�
//	public final void stop() {
//		System.out.println("���� ����");
//		speed=0;
//	}
}
