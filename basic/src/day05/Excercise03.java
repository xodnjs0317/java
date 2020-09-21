package day05;

public class Excercise03 {
public static void main(String[] args) {
	//for문을 이용하여 1부터 100까지의 정수중에서 3의 배수의 
	//총합을 구하는 코드를 작성하세요
	int sum=0;
	for (int i =1; i<=100; i++) {
		if(i%3 !=0 ) {
			continue;
	}
		sum = sum+i;
		
	}
	 System.out.println(sum);
}
}
//while(true){
//int num1 = (int)(math.random()*6)+1;
//int num2 = (int)(math.random()*6)+1;
// system.out.println("("+num1+","+num2+")");"
//if((num1+num2)==5) {
//break;
