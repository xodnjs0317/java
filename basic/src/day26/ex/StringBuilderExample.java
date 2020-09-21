package day26.ex;

public class StringBuilderExample {
	public static void main(String[] args) {
	String str = "";
		for(int i =1; i<=100; i++) {
			str+= i;
		}
		System.out.println(str);
		
	
	StringBuilder sb = new StringBuilder();
	for(int n = 1; n<=100; n++) {
		
		sb.append(n);
		
		System.out.print(n);
			}
		

	}
}
