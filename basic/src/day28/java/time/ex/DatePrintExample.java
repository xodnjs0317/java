package day28.java.time.ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrintExample {
public static void main(String[] args) {
	//SimpleDateFormat Ŭ������ �̿��ؼ� ������ ��¥�� ������ ���� ����ϴ� �ڵ带 �ۼ��� ������
	//2024�� 05�� 08�� ȭ���� 10�� 30��
	Date now = new Date();
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� E���� a HH��mm��");
	
	System.out.println(sdf.format(now));
	
	
	
	
}
}
