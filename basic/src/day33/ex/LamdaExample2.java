package day33.ex;


import java.util.function.ToIntFunction;

public class LamdaExample2 {
	private static Student[] students = {
			new Student("이태원",90,96),
			new Student("문지우",95,93)
	};
	
	
	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for(int i =0; i<students.length;i++) {
			sum += function.applyAsInt(students[i]);
			
			
		}
		double avg= (double) sum/students.length;
		return avg;
	}
	public static void main(String[] args) {
		double englishAvg = avg(s -> s.getEnglishScore());
				System.out.println("영어 평균 점수 : "+englishAvg);
				
		double mathAvg = avg(s -> s.getMathScore());
				System.out.println("수학 평균 점수 : "+mathAvg);		
	}
	
	public static class Student{
		private String name;
		private int englishScore;
		private int mathScore;
		
		public Student(String name, int englishScore, int mathScore) {
			this.name =name;
			this.englishScore=englishScore;
			this.mathScore=mathScore;
		}
		
		public String getName() {return name;}
		public int getEnglishScore() {return englishScore;}
		public int getMathScore() {return mathScore;}
	}
}
