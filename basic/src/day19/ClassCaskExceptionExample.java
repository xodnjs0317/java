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
		System.out.println("����ȯ����!");
	}else {
		System.out.println("���� ����ȯ�� �Ұ����ؿ�.");
	}
}
}