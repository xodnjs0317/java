package day29.Thread;

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator2 calculator2 = new Calculator2();
		
		User1_2 user1 = new User1_2();
		user1.setCalculator(calculator2);
		user1.start();
		
		User2_2 user2 = new User2_2();
		user2.setCalculator(calculator2);
		user2.start();
	}
}
