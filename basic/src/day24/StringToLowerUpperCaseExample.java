package day24;

public class StringToLowerUpperCaseExample {
	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "Java Programming";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		
		
		String upperStr1 = str1.toUpperCase();
		//touppercase()�� ���ڿ��� ��� �빮�ڷ� �ٲ㼭 �����ϴ� �żҵ��Դϴ�.
		String upperStr2 = str2.toUpperCase();
		
		
		System.out.println(str1.equalsIgnoreCase(str2));
		//equalsignorecase()�� ��ҹ��� ���о��� ���� ���������̸� true�� ��ȯ�ϴ� �޼ҵ��Դϴ�.
	}
}
