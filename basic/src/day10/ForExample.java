package day10;

public class ForExample {
public static void main(String[] args) {
	
	int o = 4;
	
 
	for(int i=0;i<o;i++) {
		
		
	 for(int j=0;j<o-i;j++) {
		 System.out.print(" ");
	 }
	for(int k=0;k<i*2+1;k++) {
		
		System.out.print("*");
	}
		
		System.out.println();
		 
 }
 }	 		
}
