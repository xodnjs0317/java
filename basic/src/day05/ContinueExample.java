package day05;

public class ContinueExample {
	public static void main(String[] args) {
		for(int i = 1; i<=10; i++) {
			if(i%2 !=0) { //i를 2를 나눳을때 나머지가 0이아닐때 홀수는 생략되고 2의배수만
			continue;
			}
			System.out.println(i);
		}
		
	}
}
 