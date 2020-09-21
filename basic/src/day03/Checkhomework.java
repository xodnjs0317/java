package day03;

public class Checkhomework {
	public static void main(String[] args) {
		long left = 2000000000;
		long right = -2000000000;
		//left + right 상황에서 오버플로우를 검출하세요.
		//과제  left - right 상황에서 오버플로우를 검출하세요.
				
		if(right<=0) {
			if(left-right>(Integer.MAX_VALUE )){
				System.out.println("오버플로우 발생");
			}
		}else {
			if(left-right<(Integer.MIN_VALUE)) {
				System.out.println("오버플로우 발생");
			}
		}
		
		System.out.println(left-right);

		
	}

}
