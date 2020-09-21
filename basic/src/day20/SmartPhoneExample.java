package day20;

public class SmartPhoneExample {
	public static void main(String[] args) {
		
	
	SmartPhone myPhone = new SmartPhone("구글","안드로이드");
	
	String strObj = myPhone.toString();
	System.out.println(strObj);  //스마트폰객체에서 오버라이딩한 스트링값을 스트링에 넣은 값을 출력
	
	
	System.out.println(myPhone); //스마트폰값을 바로 프린트값으로출력
	
	
	
	
	}
}
