package day25;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		//02�Ǵ� 010 ����
		//3�ڸ� Ȥ�� 4�ڸ�����
		//\��{4} 4�ڸ�����
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		}else { 
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}
		//\w �Ѱ��̻��� ���ĺ� �Ǵ� ����
		//+(\\.\\w+)�� ���ų� �ѹ��� �ü�����
		
		
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@naver.com";
				result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		} else {
			System.out.println("���Խİ� ��ġ�����ʽ��ϴ�.");
		}
	}
}
