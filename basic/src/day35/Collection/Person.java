package day35.Collection;

public class Person implements Comparable<Person>{
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person o) {
		//Comparable�� implements�Ѵٸ� compareTo()�޼ҵ带 �������̵��ϰ� �Ǵµ� �̶� return ���� ������ -1,0,1�� �������شٸ� �װ��� �������� ������ �� �ְ� �ȴ�.
		if(age<o.age) return -1;
		else if(age==o.age) return 0;
		else return 1;
	}
	

}
