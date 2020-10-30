package chap02;

public class Greeter {
	private String format;
	 
	public String greet(String guest) {
		return String.format(format, guest);
		//format = "%s, 안녕하세요." guest = 스프링
		//String.format은 printf와 비슷한방법 ex>(%s "안녕")
		
	}
	public void setFormat(String format) {
		this.format = format;
	}
}
