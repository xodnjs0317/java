package day24;

public class StringTrimExample {
	public static void main(String[] args) {
		String tel1 = "02";
		String tel2 = "123  ";
		String tel3 = "1234  ";
		
		String tel = tel1.trim()+tel2.trim()+tel3.trim();
		System.out.println(tel);
		
		//trim�޼ҵ�� ���ڿ��� �յ� ������ �����մϴ�. ������ ������ ������ �������� �ʽ��ϴ�.
		String oldStr = "�ڹ� ���α׷���";
		String newStr = oldStr.trim();
		System.out.println(newStr);
	}
}
