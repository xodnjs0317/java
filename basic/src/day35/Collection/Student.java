package day35.Collection;

public class Student {
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Student) { //학번과 이름이 동일한 경우 true를 리턴
			Student student = (Student) obj;
			return (sno==student.sno)&&(name==student.name);
		} else {
			return false;
		}
	}
	
	public int hashCode() {
		return sno+name.hashCode();
	}

}
