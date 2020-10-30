package test04;

public class Score {
	String name;
	float kor;
	float eng;
	float math;
	
	public Score() {}
	
	public Score(String name,float kor, float eng,float math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	public float average() {
		return sum() / (float)3;
	}
	public float sum() {
		return kor + eng + math;
	}
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name+","+kor+","+eng+","+math;
	}
}
