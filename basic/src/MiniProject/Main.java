package MiniProject;



import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		MainFunction func = new MainFunction();
		boolean run = true;
		Login lo = new Login();
		
		lo.login();
		while(run) {
			func.menu();
			int no = scanner.nextInt();
		switch(no) {
		case 1 : 
			func.chart(); 
			break;
		case 2 : 
			func.chart2();
			break;
		case 3 : 
			func.chart3();
			break;
		case 4 : 
			func.register();
			break;
		case 5 :
			func.chart5();
			break;
		case 6 :
			func.chart6();
			break;
		case 7 :
			func.chart7();
			break;
		case 8 :	
			func.chart8();
			break;
		case 9 :
			run = func.chart9();
			
			break;
		}
	}
		
	}
}
