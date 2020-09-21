package day07;

public class Exercise08 {
	public static void main(String[] args) {
		//주어진 배열의 전체 항목의 합과 평균 값을 구해보세요.
		
		int[][] array = {
				{95,86},{83,92,96},
				{78,83,93,87,88}
		};
		int sum = 0;
		double avg =0.0;
		double avg2 = 0.0;
		int count = 0;
		int length = 0;
		for(int i = 0;i<array.length; i++) {
			for(int arraynum : array[i]) {
				sum += arraynum;
				count++;
			}
			length += array[i].length;
		}
		avg = (double) sum / count;
		avg2 = (double) sum / length;
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
		System.out.println("avg2: " + avg2);
	}

}
