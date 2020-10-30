package test07;

import java.util.Date;

public class Tire {
	String maker;//제조사
	String spec;//규격
	Date createDate;//제조일
	
	
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getSpec() {
		return spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		
		return "[Tire:"+maker+","+spec+((createDate!=null)?(","+createDate.toString()):"")+"]";
	}
	
	
}
