package day05;

public class Excercise03 {
public static void main(String[] args) {
	//for���� �̿��Ͽ� 1���� 100������ �����߿��� 3�� ����� 
	//������ ���ϴ� �ڵ带 �ۼ��ϼ���
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
