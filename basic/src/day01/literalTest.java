package day01;

public class literalTest {
	public static void main(String[] args) {
		//정수 리터럴
		
		//0, 75 ,-100 소숫점이 없는 정수 리터럴
		//byte , char, short, int, long 에 저장이 됩니다.
		byte b = 0;
		System.out.println(b);
		//0으로 시작하는 리터럴은 8진수로 간주한다.
		//02, -04
		byte b2 = 02;
		System.out.println(b2);
		//0x 또는 0X로 시작하고 0~9 A,B,C,D,E,F 로 구성된 
		//리터럴은 16진수로 간주한다.
		int i = 0x5;
		System.out.println(i);
		
		
		//실수 리터럴
		float f = 0.25f;
		double d = -3.14;
		System.out.println(f);
		System.out.println(d);
		
		double d2= 2E3;
		double d3 = 2E-10;
		System.out.println(d2);
		System.out.println(d3);

		
		//문자 리터럴
		//(') 작은 따옴표로 묶은 텍스트는 하나이 문자 
		//리터럴로 간주 한다.
		char c = 'A';
		char c2 = '한';
		char c3 = '\t';
		char c4 = '\n';
		System.out.println(c);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

		// \t = 수평 탭, \n = 줄바꿈, \" = 큰따옴표
		// \' = 작은 따옴표 , \\ = \ , \\u16진수 = 16진수
		
		//문자열 리터럴
		//큰따옴표 "로 묶은 텍스트는 문자열 리터럴로 간주 한다.
		//큰따옴표 안에는 텍스트가 없어도 문자열 리터럴로 간주
		//문자열 리터럴 내부에서도 이스케이프 문자를 사용 가능하다.
		
		String s = "대한민국";
		String s2 = "탭만큼 이동 \t 합니다.";
		String s3 = "한줄 내려쓰기 \n 합니다.";
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);
		
		//논리 리터럴
		//true와 false는 논리 리터럴로 가정한다.
		boolean bool = true;
		boolean bool2 = false;
		System.out.println(bool);
		System.out.println(bool2);

		
		
		
		
		
		
				
		
		
		
		
	}

}
