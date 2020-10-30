package test19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Properties;

import org.springframework.beans.factory.config.AbstractFactoryBean;

//스프링에서는 팩터리를 xxxfactorybean이라고 이름을 짓습니다.
public class TireFactoryBean extends AbstractFactoryBean<Tire>{	//팩토리를 만들면 다른 클래스에서 쉽게 꺼내 쓸수있다.
	String maker;
	
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	@Override
	public Class<?> getObjectType() {
		//반환값은 팩토리 빈이 만드는 객체의 타입입니다.
		return test13.Tire.class;
	}
	//상속받느 또하나의 메소드 createInstance()를 구현
	//접근제한자가 protected인 이유는 직접사용하는 메소드가 아니라
	//getobject()에 의해 내부적으로 호출되기 때문입니다.
	@Override
	protected Tire createInstance() throws Exception {
		if(maker.contentEquals("Hankook")) {
			return createHankookTire();
		}else {
			return createKumhoTire();
		}
	}
	private  Tire createHankookTire() {
		Tire tire = new Tire();
		tire.setMaker("Hankook");
		
		Properties specProp = new Properties();
		specProp.setProperty("width", "205");
		specProp.setProperty("ratio", "65");
		specProp.setProperty("raim.diameter", "14");
		tire.setSpec(specProp);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		
		try {
			tire.setCreateDate(dateFormat.parse("2014-5-5"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tire;
	}
	
	private  Tire createKumhoTire() {
		Tire tire = new Tire();
		tire.setMaker("Kumho");
		
		Properties specProp = new Properties();
		specProp.setProperty("width", "185");
		specProp.setProperty("ratio", "75");
		specProp.setProperty("raim.diameter", "20");
		tire.setSpec(specProp);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		
		try {
			tire.setCreateDate(dateFormat.parse("2014-10-20"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tire;
	}
	
}
