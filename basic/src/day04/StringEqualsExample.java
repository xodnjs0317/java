package day04;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		String strVar3 = new String("�Ź�ö"); //��ü�� �����ϴ� ��ɾ�
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		System.out.println();
		System.out.println(strVar1.equals(strVar2));//.equals�� ���̸� �ּҰ� �ƴ� ���� ���ϰ� �ȴ�.
		System.out.println(strVar1.equals(strVar3));
	}
}
