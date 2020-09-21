package day16;

public abstract class Chicken {
	String origin; double taste;
	abstract void cook();
	
}

class Crispychicken extends Chicken{
	boolean isCrispy;
	void cookWithOil() {
		this.taste +=5;
		System.out.println("±â¸§¿¡ Æ¢°å½À´Ï´Ù.");
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
		System.out.println("Æ¢°Ü¼­ ¾ç³äÀ» ¹ß¶ú½À´Ï´Ù.");
		isSweet = true;
	}
	@Override
	void cook() {
		
		
	}
}
