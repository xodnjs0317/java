package test09;

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

	public float getKor() {
		return kor;
	}

	public void setKor(float kor) {
		this.kor = kor;
	}

	public float getEng() {
		return eng;
	}

	public void setEng(float eng) {
		this.eng = eng;
	}

	public float getMath() {
		return math;
	}

	public void setMath(float math) {
		this.math = math;
	}

	public void setName(String name) {
		this.name = name;
	}
}
