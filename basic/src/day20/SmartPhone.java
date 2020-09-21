package day20;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company,String os) {
		this.company = company;
		this.os= os;
	}
	
	@Override
	public String toString() { 	//tostring 을 오버라이드하여 자신이 원하는 형식으로 출려되는 문자열을 바꿀수있다.
		return company +","+os;
	}
}
