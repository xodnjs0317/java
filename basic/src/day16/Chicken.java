package day16;

public abstract class Chicken {
	String origin; double taste;
	abstract void cook();
	
}

class Crispychicken extends Chicken{
	boolean isCrispy;
	void cookWithOil() {
		this.taste +=5;
		System.out.println("�⸧�� Ƣ����ϴ�.");
		isCrispy = true;
	}
	@Override
	void cook() {
		
		
	}
}

class SweetSauceChicken extends Chicken {
	boolean isSweet;
	void cookWithSauce() {
		this.taste+=4;
		System.out.println("Ƣ�ܼ� ����� �߶����ϴ�.");
		isSweet = true;
	}
	@Override
	void cook() {
		
		
	}
}
