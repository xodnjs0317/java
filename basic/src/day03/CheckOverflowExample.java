package day03;

public class CheckOverflowExample {
	public static void main(String[] args) {
		long left = 2000000000;
		long right = -2000000000;
		//left + right ��Ȳ���� �����÷ο츦 �����ϼ���.
		//����  left - right ��Ȳ���� �����÷ο츦 �����ϼ���.
				
		if(right>0) {
			if(left>(Integer.MAX_VALUE-right )){
				System.out.println("�����÷ο� �߻�");
			}
		}else {
			if(left<(Integer.MIN_VALUE-right)) {
				System.out.println("�����÷ο� �߻�");
			}
		}
		
		System.out.println(left+right);

		
	}

}
