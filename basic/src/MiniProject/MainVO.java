package MiniProject;

public class MainVO extends ProductVO{
	
	private String location;
	private String number;
	
	
	public MainVO(int no,String location, String name, String number) {
		this.no = no;
		this.name = name;
		this.location = location;
		this.number = number;
	}

	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
}
