package day19;

public class LonginExample {
	public static void main(String[] args) {
		try {
			login("white","12345");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "54321");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException{
		if(!id.equals("blue")) {
			throw new NotExistIDException("ID가 존재하지 않습니다.");
		} 
		if(!password.contentEquals("12345")) {
			throw new WrongPasswordException("패스워드가 틀립니다.");
		}
	}
}
