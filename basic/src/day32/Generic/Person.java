package day32.Generic;

class Worker extends Person {

	Worker(String neme) {
		super(neme);
		// TODO Auto-generated constructor stub
	}}

class Student extends Person {

	Student(String neme) {
		super(neme);
		// TODO Auto-generated constructor stub
	}}

class HighStudent extends Student{

	HighStudent(String neme) {
		super(neme);
		// TODO Auto-generated constructor stub
	}}

public class Person {
	String name;
	
	Person (String neme){
		this.name=name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
