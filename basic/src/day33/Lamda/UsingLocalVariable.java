package day33.Lamda;

public class UsingLocalVariable {
	void method(int arg) {
		int localVar = 40;
		
		MyFunctionalInterface fi =() ->{
			System.out.println("arg " + arg);
			System.out.println("localVar : "+localVar+"\n");
		};
		//�޼ҵ� ���ο� �ִ� ���ٽ��� �޼ҵ��� �ʵ带 �����Ҷ��� �޼ҵ� ���� �Ŀ� �ʵ尡 �������
		//������ ���� �������� �ʰ� �ϱ� ���� final Ư���� �����ϴ�.
		
		fi.method();
	}
}
