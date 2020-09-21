package day15;

public class Student extends People {
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name,ssn); //부모생성자를  super를 통해서 호출합니다.
		this.studentNo = studentNo;
	}
}
