package day27.Calendar;
import java.util.Calendar;
import java.util.Scanner;
public class CalendarEx5 {
	private static Scanner scanner = new Scanner(System.in);	
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		boolean run = true;
		
		while(run) {
			System.out.println("�׸��� �����ϼ���."+"(1. ����޺��� 2. �����޺��� 3. �����޺��� 4. ����)  :");
			int selectNo = scanner.nextInt();
			if(selectNo ==1) {
				System.out.println(today.get(Calendar.YEAR)+"��"+(today.get(Calendar.MONTH)+1)+"��");
				System.out.println("-----------------------------------------");
				System.out.println("  ��|\t��|\tȭ  |\t��  |\t��  |\t��  |\t��  |  ");
				System.out.println("-----------------------------------------");
				today.set(Calendar.DATE, 1);
				
				for(int k = 1;k< today.get(Calendar.DAY_OF_WEEK);k++) {
					System.out.print("\t");
					
					for(int i =1; i<=today.getActualMaximum(Calendar.DATE); i++) {
						today.set(Calendar.DATE, i);
					System.out.print(i+"\t");
					}
				}
		
		}
}
	}
	
}
