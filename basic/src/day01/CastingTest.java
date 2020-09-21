package day01;

public class CastingTest {
	public static void main(String[] args) {
		int i = 127;
		byte b = 100;
		float f = 1.1f;
		
		double d = f;
		
		float f1 = (float)d;
		
		int i2 = b; //묵시적 또는 업캐스팅이라고 한다.
		
		byte c = (byte)i;// 작은 것이 큰 것을 담는다. 
		//다운 캐스팅 형변환 연산자 값 손실이 발생 할수 있습니다.
		
		System.out.println(c);
		
		
	}

}
