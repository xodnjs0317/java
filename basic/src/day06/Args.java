package day06;

public class Args {
public static void main(String[] args) {
	if(args.length !=2) {
		System.out.println("���α׷��� ����");
		System.out.println("java MainStringArryArgument num1 num2");
		System.exit(0); // ���� ���� ��ɾ�
	}
	
	String strNum1 = args[0];
	String strNum2 = args[1];
	
	int num1 = Integer.parseInt(strNum1); //string�� int�ιٲٴ� ��ɾ�
	int num2 = Integer.parseInt(strNum2);
	
	int result = num1 + num2;
	System.out.println(num1 + "+"+num2+"="+result);
}
}
