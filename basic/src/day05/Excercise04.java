package day05;

public class Excercise04 {
	public static void main(String[] args) {
		//while 문과 Math.random() 메소드를 이용해서 두개의
		//주사위를 던졌을때 나오는 눈을 (눈1,눈2) 형태로 출력하고,
		//눈의 합이 5가 아니면 주사위를 계속 던지고, 눈의 합이 5이면 실행을 멈추는
		//코드를 작성해보세요.
		int num1 = 0;
		int num2 = 0;
		int sum= 0;
		
		while(true) {
			if(sum != 5) {
				num1 = (int)(Math.random()*6)+1;
				num2 = (int)(Math.random()*6)+1;
				System.out.println(num1+","+num2);
				sum = (num1+num2);
				
			} else
			break;
	
	}	System.out.println("프로그램종료");
			

			
}
}


		
	


