package day16;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "date1";
		parent.method1();
		parent.method2();
		/*
		 * parent.field2 = "date2";   //�ڵ� Ÿ�Ժ�ȯ���� �ڽ�Ŭ������ �����ʵ�� �޼ҵ�� ���Ұ�
		 * parent.method3();
		 */
		//���� Ÿ�� ��ȯ�� �������� �ڽ� ��ü���� ��ü���� ������ Ÿ���� �ڽ�Ŭ������ ���ư��� �ֽ��ϴ�.
		//���� �θ�Ÿ���̾��� ��ü�� �ڽ� Ŭ������ ����Ÿ�Ժ�ȯ�� �Ұ��մϴ�.
		Child child =(Child) parent; //����Ÿ�Ժ�ȯ
		child.field2 = "yyy";
		child.method3();
	}
}
