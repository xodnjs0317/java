package day26.ex;

import java.util.regex.Pattern;

//ù��°�� ���ĺ����� �����ϰ� �ι�°���� ���ڿ� ���ĺ����� ������ 8~12�ڻ����� ID������ �˻��ϰ�ͽ��ϴ�.
//���ĺ��� ��ҹ��ڸ� �������� ��쿡 ���� ǥ������ �̿��ؼ� �����ϴ� �ڵ带 �ۼ��غ�����


public class PatternMatcherExample {
	public static void main(String[] args) {
		String id = "5Angel1004";
		String id2 = "Dlxodnjs0317";
		String regExp = "[a-zA-Z]\\d+{8,12}";
		boolean isMatch = Pattern.matches(regExp, id2);
		if(isMatch) {
			System.out.println("ID�� ����� �� �ֽ��ϴ�.");
		}else {
			System.out.println("ID�� ����Ҽ������ϴ�.");
		}
	}
}
