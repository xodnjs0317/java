package day32.Generic;

public class Course <T>{
	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {
		this.name = name;
		students =(T[])(new Object[capacity]);
		//Ÿ�� �Ķ���ͷ� �迭�� �����Ϸ��� new T[n] ���·� �迭�� �����ϴ� ��ſ�
		//(T[])(new Object[n]���� �����ؾ� �մϴ�.
		
	}
	public String getName() {return name;}
	public T[] getStudents() {return students;}
	public void add(T t) {
		for(int i =0; i<students.length; i++) {
		//�迭�� ����ִ� �κ��� ã�Ƽ� �������� �߰��ϴ� �޼ҵ�
			if(students[i]==null) {
				students[i] =t;
				break;
				
				
			}
		}
	}
	

}
