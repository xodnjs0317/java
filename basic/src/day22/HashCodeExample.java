package day22;

import java.util.Objects;

import day08.Student;

public class HashCodeExample {
	public static void main(String[] args) {
		Student s1 = new Student(1,"홍길동");
		Student s2 = new Student(1, "홍길동");
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2));
	}
	
	static class Student{
		int sno;
		String name;
		Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}
		@Override
		public int hashCode() {
			return Objects.hash(sno,name);
			//hash는 hash코드를 만드는 메소드로써, 같은매개변수가 들어온다면 서로다른 객체라도 같은 해쉬코드를 생성합니다.
		}
	}
}
