package day35.ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1,"문지우"));
		set.add(new Student(2,"이태원"));
		set.add(new Student(1,"유재헌"));
		
		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum+":"+student.name);
		}
		
	}

}
