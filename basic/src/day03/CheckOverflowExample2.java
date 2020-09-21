package day03;

public class CheckOverflowExample2 {
	public static void main(String[] args) {
		try {
			int result = safeAdd(2000000000,2000000000);
			System.out.println(result);
			
		}catch(ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 "
					+ "정확하게 계산할수 없음");
		}
	}
	public static int safeAdd(int left,int right) {
		
		if(right>0) {
			if(left>(Integer.MAX_VALUE- right)){
				throw new ArithmeticException("오버플로우");
			}
		}else {
			if(left<(Integer.MIN_VALUE -right)) {
				throw new ArithmeticException("오버플로우");
			}
		}
		return left+right;
	}

}
