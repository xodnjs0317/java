package day27.Calendar;
import java.util.Calendar;
import java.util.Scanner;
public class CalendarEx5 {
	private static Scanner scanner = new Scanner(System.in);	
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		boolean run = true;
		
		while(run) {
			System.out.println("항목을 선택하세요."+"(1. 현재달보기 2. 이전달보기 3. 다음달보기 4. 종료)  :");
			int selectNo = scanner.nextInt();
			if(selectNo ==1) {
				System.out.println(today.get(Calendar.YEAR)+"년"+(today.get(Calendar.MONTH)+1)+"월");
				System.out.println("-----------------------------------------");
				System.out.println("  일|\t월|\t화  |\t수  |\t목  |\t금  |\t토  |  ");
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
