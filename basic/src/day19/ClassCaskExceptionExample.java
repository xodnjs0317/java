package day19;

public class ClassCaskExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		//Cat cat = New Cat();
		//changeDog(cat);
	}
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
		Dog dog =(Dog) animal;
		System.out.println("형변환성공!");
	}else {
		System.out.println("강제 형변환이 불가능해요.");
	}
}
}