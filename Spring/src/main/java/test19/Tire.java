package test19;

import java.util.Date;
import java.util.Map.Entry;
import java.util.Properties;

public class Tire {
	String maker;//제조사
	Properties spec;//규격
	Date createDate;//제조일
	
	
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public Properties getSpec() {
		return spec;
	}
	public void setSpec(Properties spec) {
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
		StringBuffer specInfo = new StringBuffer();
		if(spec!=null) {
			for(Entry<Object,Object> entry: spec.entrySet()) {
				specInfo.append(entry.getKey()+":"+entry.getValue()+",");
			}
		}
			return "[Tire:"+maker+","+specInfo.toString()+((createDate!=null)?
					(","+createDate.toString()):"")+"]";
	}
	
	
}
