package day24.ex;

public class CalculateRates {
	public static void main(String[] args) throws Exception {
		CalculateRates calculateRates = new CalculateRates();

		// 비율 결과: 5.0%, 16.0%, 11.0%, 42.0%, 26.0%
		calculateRates.calculate(new int[] { 10, 30, 20, 80, 50 });

		// 비율 결과: 20.0%, 20.0%, 20.0%, 20.0%, 20.0%
		calculateRates.calculate(new int[] { 50, 50, 50, 50, 50 });

		// 비율 결과: 7.0%, 13.0%, 20.0%, 27.0%, 33.0%
		calculateRates.calculate(new int[] { 1, 2, 3, 4, 5 });
	}
	
	// 구현
	public void calculate(int[] nums) throws Exception {
		int sum = 0;
		double d =0;
		
	for(int i =0;i<nums.length;i++) {
		sum = sum+ nums[i];
		
		}
	for (int i = 0; i < nums.length; i++) {
		d  = nums[i]/(double)sum*100;

	for(int k= 0; k<Math.round(d);k++) {	
		System.out.print("*"); 
	
	}
	double w = Math.round(d);
	System.out.printf("%.1f%%",w);
	System.out.println();
		
	
	}
		
	}

	
	
	
}

