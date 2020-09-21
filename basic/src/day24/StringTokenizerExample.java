package day24;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String text = "ȫ�浿/�̼�ȫ/�ڿ���";
		
		//how��ü ��ū ���� ��� for������ Ǫ��
		StringTokenizer st = new StringTokenizer(text,"/");
		int countTokens = st.countTokens(); //�����ִ� ��ū������ȯ�մϴ�.
		for(int i = 0; i <countTokens; i++) {
			String token = st.nextToken();
			//nexttoken�� �����ִ� ��ū�� �ϳ��� ��ȯ�ϰ�, ������ ��ū�� �����մϴ�.
			System.out.println(token);
		}
				
		st = new StringTokenizer(text,"/");
		while(st.hasMoreTokens() ){
			//hasmoretokens�� ��ū�� �������� �ִ��� �˷��ִ� �޼ҵ��Դϴ�. �����ִٸ� true�� ��ȯ�մϴ�.
			
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
