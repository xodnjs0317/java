package test19;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	String model;//�𵨸�
	Engine engine;//����
	Tire[] tires;//Ÿ�̾�
	Map<String, Object> options;//���û���
	
	public Map<String, Object> getOptions() {
		return options;
	}

	public void setOptions(Map<String, Object> options) {
		this.options = options;
	}
	public Car() {}

	public Car(String model, Engine engine) {
		this.model = model;
		this.engine = engine;
		
		
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Engine getEngine() {
		return engine;
	}
	@Autowired(required = false)
	@Qualifier("kiaEngine")
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Tire[] getTires() {
		return tires;
	}

	public void setTires(Tire[] tires) {
		this.tires = tires;
	}

	@Override
	public String toString() {
		StringBuffer carInfo = new StringBuffer();
		
		carInfo.append(engine.toString());
		if(tires !=null) {
			for(Tire tire : tires) {
				carInfo.append("\n"+tire.toString());
			}
		}
	
		return carInfo.toString();
	}
	
	
}
