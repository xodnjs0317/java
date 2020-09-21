package day26;

public class StringToPrimitiveValueExample {
	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		byte b = Byte.parseByte("123");
		short s = Short.parseShort("3");
		long l = Long.parseLong("4");
		float f = Float.parseFloat("3.4");
		
		System.out.println("value1: "+value1);
		System.out.println("value1: "+value2);
		System.out.println("value1: "+value3);
		
	}
}
