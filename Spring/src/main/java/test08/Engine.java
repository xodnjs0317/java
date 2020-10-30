package test08;

public class Engine {
	String maker;//제조사
	int cc; //배기량
	
	public Engine() {}
	
	public Engine(String maker,int cc) {
		this.maker=maker;
		this.cc=cc;
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Engine:"+maker+","+cc+"]";
	}


	public String getMaker() {
		return maker;
	}


	public void setMaker(String maker) {
		this.maker = maker;
	}


	public int getCc() {
		return cc;
	}


	public void setCc(int cc) {
		this.cc = cc;
	}
}
