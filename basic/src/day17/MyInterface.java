package day17;

public interface MyInterface {
	public void method1();
	
	
	//����Ʈ �޼ҵ带 ����ϴ� ������ �ε����ϰ� �������̽��� �� �ٸ� �޼ҵ带 �߰��� ���
	//������ ������ü���� ��� ������ �ʿ���� �ϳ��� �޼ҵ常 �߰��ϱ� ���ؼ� ����ϰ� �˴ϴ�.
	public default void method2() {
		System.out.println("MyInterface-method2 ����");
	}
}
