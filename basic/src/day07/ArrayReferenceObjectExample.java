package day07;

public class ArrayReferenceObjectExample {
	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] ="Java";
		strArray[1] ="Java";
		strArray[2] = new String("Java");
		
		System.out.println(strArray[0] ==strArray[1]);
		System.out.println(strArray[0] ==strArray[2]);
		System.out.println(strArray[0].equals(strArray[1]));
	}   //배열의 경우도 일반 String과 마찬가지로 .equals를 이용해서 비교해야합니다.
	    //참조타입이나 객체를 사용할때 new를사용 = String
}
