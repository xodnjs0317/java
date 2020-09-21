package day18.anonymous;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous2 anony = new Anonymous2();
		
		anony.field.turnOn();
		
		anony.method1();
		
		anony.method2(
			new RemoteControl() {
				@Override
				public void turnOn() {
					System.out.println("SmartTV¸¦ ÄÕ´Ï´Ù.");
					
				}
				@Override
				public void turnOff() {
					System.out.println("SmartTV¸¦ ²ü´Ï´Ù.");
				}
				
				
			}
				);
	}
}
