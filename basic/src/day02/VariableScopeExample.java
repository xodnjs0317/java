package day02;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 9;
		
		
		//if 함수는 ()가로 안에 값이 참일때 실행되는 메소드
		//이다.
		if(v1>10) {
			int v2 = v1 -10;
			
		}
		//int v2는 if 블럭안에서만 사용 가능 하기 때문에 
		// 블럭을 벗어나면 다시 선언 가능
		int v2 = 2;
		int v3 = v1 + v2 + 5;
		
	}
}
