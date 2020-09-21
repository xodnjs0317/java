package day11;

public class Computer {
	//매개변수를 배열로 지정하게 되면 배열을 받아서 배열의 숫자만큼 매개변수를 받을수 있습니다.
	int sum1(int[] values) {
		int sum = 0;
		for(int i = 0; i <values.length; i++) {
			sum += values[i];
			
		}
		return sum;
	}
	//매개변수에...을 붙이게 되면 여러개의 값들이 들어왔을 경우 자동으로 배열로 만들어줍니다.
	int sum2(int...values) {
		int sum = 0;
		for(int i=0; i<values.length;i++) {
			sum += values[i]; 
		}
		return sum;
	}
}
