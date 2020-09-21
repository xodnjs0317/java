package day33.Lamda;

public class Student {
	private String name;
	private int englishScore;
	private int mathScore;
	
	private String gendar;
	private int score;
	
	
	public Student(String name, int englishScore, int mathScore) {
		this.name =name;
		this.englishScore =englishScore;
		this.mathScore =mathScore;
		
	
	}
	public Student(String name, String gendar, int score) {
		this.name =name;
		this.gendar= gendar;
		this.score = score;
	}
	
	public String getName() {return name;}
	public int getEnglishScore() {return englishScore;}
	public int getMathScore() {return mathScore;}
	public String getGendar() {return gendar;}
	public int getScore() {return score;}
}
