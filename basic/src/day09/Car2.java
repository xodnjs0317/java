package day09;

public class Car2 {
	//�ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//������
	//�����ڴ� ��ü�� �����Ҷ� �ڵ����� ����Ǵ� �޼ҵ��Դϴ�.
	
	Car2() {
		//this.model = model;
		//this.color = color;
		//this.maxSpeed = maxSpeed;
		//3���� ��� �ϴ� �ڵ带 �����ڸ� ȣ�������ν� ���ٷ� ���ϼ� �ִ�.
	}
	Car2(String model) {
		this(model,"����",250);
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