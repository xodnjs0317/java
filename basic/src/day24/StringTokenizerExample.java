package day24;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";
		
		//how전체 토큰 수를 얻어 for문으로 푸링
		StringTokenizer st = new StringTokenizer(text,"/");
		int countTokens = st.countTokens(); //남아있는 토큰수를반환합니다.
		for(int i = 0; i <countTokens; i++) {
			String token = st.nextToken();
			//nexttoken은 남아있는 토큰을 하나씩 반환하고, 배출한 토큰은 삭제합니다.
			System.out.println(token);
		}
				
		st = new StringTokenizer(text,"/");
		while(st.hasMoreTokens() ){
			//hasmoretokens은 토큰을 더가지고 있는지 알려주는 메소드입니다. 남아있다면 true를 반환합니다.
			
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
