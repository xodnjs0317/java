package day24.ex;

import java.util.StringTokenizer;

public class SpliteExample {
	public static void main(String[] args) {
		String str = "���̵�,�̸�,�н�����";
		//���1(Split ()�޼ҵ� �̿�)
		String[] names = str.split(",");
		
		for(String name : names) {
		
			System.out.println(name);
		}
		
		System.out.println();
		
		
		//���2(StringTokenizer �̿�)
		String text = "���̵�/�̸�/�н�����";
		
		StringTokenizer st = new StringTokenizer(text,"/");
		int countTokens = st.countTokens();
		for(int i =0; i<countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();
		
		//������
		st = new StringTokenizer(text,"/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
	}
}
