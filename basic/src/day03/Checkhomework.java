package day03;

public class Checkhomework {
	public static void main(String[] args) {
		long left = 2000000000;
		long right = -2000000000;
		//left + right ��Ȳ���� �����÷ο츦 �����ϼ���.
		//����  left - right ��Ȳ���� �����÷ο츦 �����ϼ���.
				
		if(right<=0) {
			if(left-right>(Integer.MAX_VALUE )){
				System.out.println("�����÷ο� �߻�");
			}
		}else {
			if(left-right<(Integer.MIN_VALUE)) {
				System.out.println("�����÷ο� �߻�");
			}
		}
		
		System.out.println(left-right);

		
	}

}