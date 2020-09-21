package day19;

public class NullPointExceptionExample {
	public static void main(String[] args) {
		String data = null;
		//System.out.println(data.toString());
		
		int[] i = new int [100]; 
		
		for(int j =0;j<=i.length;j++) {
			System.out.println(i[j]);
		}
	
	
	}
}
