package day20;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company,String os) {
		this.company = company;
		this.os= os;
	}
	
	@Override
	public String toString() { 	//tostring �� �������̵��Ͽ� �ڽ��� ���ϴ� �������� ����Ǵ� ���ڿ��� �ٲܼ��ִ�.
		return company +","+os;
	}
}
