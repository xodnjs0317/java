package MiniProject;

public class LoginVO {
	String ID;
	String password;
	
	public LoginVO(String ID, String password) {
		this.ID = ID;
		this.password = password;
	}
	
	public String getID() {
		return ID;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
	public String getPassWord() {
		return password;
	}
	public void setPassWord(String password) {
		this.password = password;
	}
}
