package day18;

public class ClassNameExample {
	public static void main(String[] args) {
		//NestClassName cn = new NestClassName();
		//��ø�� Ŭ������ ��ø�Ǳ����� Ŭ������ ����� �����¹ٷ� ������ֽ��ϴ�.
		ClassName cn = new ClassName();
		ClassName.NestedClassName nc = cn.new NestedClassName();
		
		nc.i = 1;//�ϴ� ��ü�� ����� ���� �Ϲ� Ŭ����ó�� �޼ҵ�� �ʵ带  �ҷ���  �� �ֽ��ϴ�.
	}
}
