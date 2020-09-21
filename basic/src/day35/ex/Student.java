package day35.ex;

public class Student {
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		//�ۼ���ġ
		return studentNum;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		//�ۼ� ��ġ
	if(obj instanceof Student) {
		Student student = (Student) obj;
		return student.studentNum == studentNum;
	} else {
		return false;
	}
		
	}

}
