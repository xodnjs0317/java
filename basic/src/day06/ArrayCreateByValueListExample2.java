package day06;

public class ArrayCreateByValueListExample2 {
public static void main(String[] args) {
	int[] scores;
	scores = new int[] {83,90,87};
	int sum1 = 0;
	for(int i =0; i<3;i++) {
		sum1 +=scores[i]; 
	}
	System.out.println("����:" +sum1); //�迭�� ����
	
	int sum2 = add(new int[] {83, 90, 87});
	System.out.println("����:" +sum2);
	System.out.println();
}
	public static int add(int[] scores) {//<- �޼ҵ带 �θ��� ���� ����
		int sum= 0;							//�޼ҵ忡 ���� �Է°� �޼ҵ忡83,90,87�� ���� �迭�ε�
		for(int i= 0; i <3; i++) {
			sum+= scores[i];
		}
		return sum; //�޼ҵ���°�
	
}

	
}
