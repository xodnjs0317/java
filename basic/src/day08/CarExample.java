package day08;

public class CarExample {
	public static void main(String[] args) {
		//��ü ����
		Car myCar = new Car();
		
		//�ʵ尪 �б�
		System.out.println("����ȸ��:" + myCar.company);
		System.out.println("����ȸ��:" + myCar.model);
		System.out.println("����ȸ��:" + myCar.color);
		System.out.println("����ȸ��:" + myCar.maxSpeed);
		System.out.println("����ȸ��:" + myCar.speed);
		
		myCar.speed = 60;
		System.out.println("������ �ӵ� : "+ myCar.speed);
	}
}
