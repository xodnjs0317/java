package day02;

public class If {
	
	public static void main(String[] args) {
		int v1 = 2;
		
		//if 함수는 ()가로 안에 값이 참일때 실행되는 메소드
		//이다.
		//같다라는 등식을 만들때는 x == y 형식으로 사용가능
		if(v1>10) 
		{			
			v1 = 0;
			System.out.println("진실일때 실행");
		}
		//else일 경우는 if 함수 가로 안의 값이 거짓일 때
		//실행되는 메소드입니다.
		else {
			System.out.println("거짓일때 실행");
		}
		//만약 else가 없다면 거짓일 때 실행되는 메소드는 
		//없습니다.
		System.out.println("무조건 실행");
		System.out.println(v1);
		
	}

}
