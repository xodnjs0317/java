package chap02;

public class Greeter {
	private String format;
	 
	public String greet(String guest) {
		return String.format(format, guest);
		//format = "%s, �ȳ��ϼ���." guest = ������
		//String.format�� printf�� ����ѹ�� ex>(%s "�ȳ�")
		
	}
	public void setFormat(String format) {
		this.format = format;
	}
}
