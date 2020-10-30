package test19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Properties;

import org.springframework.beans.factory.config.AbstractFactoryBean;

//������������ ���͸��� xxxfactorybean�̶�� �̸��� �����ϴ�.
public class TireFactoryBean extends AbstractFactoryBean<Tire>{	//���丮�� ����� �ٸ� Ŭ�������� ���� ���� �����ִ�.
	String maker;
	
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	@Override
	public Class<?> getObjectType() {
		//��ȯ���� ���丮 ���� ����� ��ü�� Ÿ���Դϴ�.
		return test13.Tire.class;
	}
	//��ӹ޴� ���ϳ��� �޼ҵ� createInstance()�� ����
	//���������ڰ� protected�� ������ ��������ϴ� �޼ҵ尡 �ƴ϶�
	//getobject()�� ���� ���������� ȣ��Ǳ� �����Դϴ�.
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
