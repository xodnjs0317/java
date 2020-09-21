package day19;

public class MultiCatchExample {
	public static void main(String[] args) {
		try {
			String data1= args[0];
			String data2= args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println((data1+"+"+data2+"="+result));
		} catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			//��Ƽ catch�ۼ�
			System.out.println("���� �Ű� ���� ���� �����մϴ�.");
		}catch(Exception e) { //exception�� ��� ���ܸ� ó���Ҽ� �ִ� ���� ������ �ִ¿��ܿ��ϴ�.
			
			System.out.println("���࿡ ������ �ֽ��ϴ�.");
		} finally {
			System.out.println("�ٽ� �����ϼ���.");
		}
	}
}
