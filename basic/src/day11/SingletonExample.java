package day11;

public class SingletonExample {
	public static void main(String[] args) {
		//Signleton obj1 = new Signleton();
		//Singleton obj2 = new Singleton();
		//����ó�� new�� ���ο� ��ü�� ������� ����.
		
		
		Singleton obj3 = Singleton.getInstance();
		Singleton obj4 = Singleton.getInstance();
		
		
		if(obj3==obj4) {
			System.out.println("���� �̱��� ��ü �Դϴ�.");
		}else {
			System.out.println("�ٸ� �̱��� ��ü �Դϴ�.");
		}
	}
}
