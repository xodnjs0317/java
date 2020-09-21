package day29.Thread;

public class User2_2 extends Thread{
private Calculator2 calculator;
	
	public void setCalculator(Calculator2 calculator) {
		this.setName("User2_2");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(50);
}
}