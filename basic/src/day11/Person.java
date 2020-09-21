package day11;

public class Person {
	final String nation = "Korea";
	final String ssn;
	String name;
	
	
	//final은 처음 선언될때와 생성자를 통해서만 수정이나 초기화가 가능합니다.
	public Person(String ssn,String name) {
		this.ssn =ssn;
		this.name =name;
		
	}
	
}
