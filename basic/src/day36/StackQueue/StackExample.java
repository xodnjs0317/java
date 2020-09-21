package day36.StackQueue;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));		//push() 메소드를 통해서 스택에값을 넣어주니다.
		
		while(!coinBox.isEmpty()) {
			
			Coin coin2 = coinBox.peek();
			System.out.println("꺼내온 동전 : " +coin2.getValue()+"원" );
			//peek() 메소드를 사용하면 맨위 스택에서 값을 꺼내오지만 꺼낸값을 삭제하진않습니다.
			
			
			
			Coin coin =coinBox.pop();
			System.out.println("꺼내온 동전 : " +coin.getValue()+"원" );
			//pop() 메소드를 사용하면 맨위 스택에서 값을 꺼내오면서 꺼낸값을 삭제합니다.
			
		}
	}
}
