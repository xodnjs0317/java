package day33.Lamda;

public class MyFunctionInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = () -> {
			String str = "method call";
			System.out.println(str);
		};
		fi.method();
		
		fi = () -> {System.out.println("method call2");};
		fi.method();
		
		fi = () -> System.out.println("method call3");
		fi.method();
		
		//���๮�� �Ѱ���� �߰�ȣ ��������
		if(true) System.out.println("����");
	}
}

//	Runnable fi = new Runnable() {
//	public void run() {...};
//	���ٽİ� ���� ����� �ϴ� ������ �͸� ������ü
//	Runnable runnable = () -> {...};
//	}
