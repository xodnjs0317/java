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
		//Comparable을 implements한다면 compareTo()메소드를 오버라이딩하게 되는데 이때 return 값의 기준을 -1,0,1로 나누어준다면 그것을 기준으로 정렬할 수 있게 된다.
		if(age<o.age) return -1;
		else if(age==o.age) return 0;
		else return 1;
	}
	

}
