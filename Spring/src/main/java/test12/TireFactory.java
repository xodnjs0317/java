package test12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Properties;



public class TireFactory {	//팩토리를 만들면 다른 클래스에서 쉽게 꺼내 쓸수있다.
	public  Tire createTire(String maker) {
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
