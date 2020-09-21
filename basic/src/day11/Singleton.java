package day11;

public class Singleton {
	//���� �ʵ�� �ڱ��ڽ��� ��ü����
	private static Singleton s = new Singleton();
	
	
	
	//������ private�� �ٸ� Ŭ�������� ������ �������� ���ϰ� ���ƹ���
	private Singleton() {
		
	}
	
	//�̱��� ��ü�� ���̶�� getInstance()�޼ҵ带 ���� ������ ��ü�� �ҷ��ü� ����
	static Singleton getInstance() {
		return s;
		
	}
	
}
