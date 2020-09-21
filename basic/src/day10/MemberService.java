package day10;

public class MemberService {
	String id = "hong";
	String password ="12345"; 
	boolean b = false;
	
	
	boolean login(String id, String password){
		if(this.id.equals(id)&&this.password.equals(password)){
		b = true;
		}else {
		b= false;
		}
		return b;
		}
	boolean logout(String id) {
		this.id= id;
		if(this.id.equals(id)) {
			System.out.println("로그아웃 되었습니다.");
		}
	return b;}
	
	}
	


