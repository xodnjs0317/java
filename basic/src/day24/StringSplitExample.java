package day24;

public class StringSplitExample {
	public static void main(String[] args) {
		String text = "홍길동&이수홍,박연수,김자바-최명호";
		
		
		//split는 특정 문자로 문자열을 분리하는 메소드입니다.
		String[] names = text.split("&|,|-");
		
		for(String name : names) {
			System.out.println(name);
		}
	}
}
