package day22;

import java.util.Objects;

import day08.Student;

public class HashCodeExample {
	public static void main(String[] args) {
		Student s1 = new Student(1,"ȫ�浿");
		Student s2 = new Student(1, "ȫ�浿");
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
			//hash�� hash�ڵ带 ����� �޼ҵ�ν�, �����Ű������� ���´ٸ� ���δٸ� ��ü�� ���� �ؽ��ڵ带 �����մϴ�.
		}
	}
}
