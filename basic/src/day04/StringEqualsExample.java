package day04;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철"); //객체를 설명하는 명령어
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		System.out.println();
		System.out.println(strVar1.equals(strVar2));//.equals를 붙이면 주소가 아닌 값만 비교하게 된다.
		System.out.println(strVar1.equals(strVar3));
	}
}
