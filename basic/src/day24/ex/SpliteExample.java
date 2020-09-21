package day24.ex;

import java.util.StringTokenizer;

public class SpliteExample {
	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		//방법1(Split ()메소드 이용)
		String[] names = str.split(",");
		
		for(String name : names) {
		
			System.out.println(name);
		}
		
		System.out.println();
		
		
		//방법2(StringTokenizer 이용)
		String text = "아이디/이름/패스워드";
		
		StringTokenizer st = new StringTokenizer(text,"/");
		int countTokens = st.countTokens();
		for(int i =0; i<countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();
		
		//실행결과
		st = new StringTokenizer(text,"/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
	}
}
