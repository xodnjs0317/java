package day38.io2;

import java.util.Date;

public class PrintfStreamExample {
	public static void main(String[] args) {
		System.out.printf("상품의 가격 :%d원\n",123);
		//%d는 정수를 의미
		System.out.printf("상품의 가격 :%6d원\n",123);
		//%6는 왼쪽으로 자리수 6자리로 출력 빈자리는 빈공간으로 출력합니다.
		System.out.printf("상품의 가격 :%-6d원\n",123);
		//%-6는 6자리 숫자로 출력하되 오른쪽빈자리는 공백으로 출력 (왼쪽 정렬)
		System.out.printf("상품의 가격 :%06d원\n",123);
		//%-6는 6자리의 숫자를 출력하되 빈자리는 0으로 채웁니다.
		
		System.out.printf("반지름이 %d인 원의 넓이 : %10.2f\n",10,Math.PI*10*10);
		
		System.out.printf("%6d| %-10s|%10s\n",1,"홍길동", "도적");
		
		Date now = new Date();
		
		System.out.printf("오늘은 %tY년 %tm월%td일 입니다.\n",now , now,now);
		System.out.printf("오늘은 %1$tY년 %1$tm월%1$td일 입니다.\n",now);
		System.out.printf("현재 %1$tH시 %1$tM분 %1$tS초 입니다.\n",now);
	}
}
