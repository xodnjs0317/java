package day06;

public class ArrayCreateByValueListExample1 {
	public static void main(String[] args) {
		int[] scores;
		scores = new int[]{83,90,87}; //�迭�� ���� �߰��η� ��� 
		//���� ������ 
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		//�迭���� ����� �迭[0] ���� �迭[����-1]���� ����� �����մϴ�.
		
		int sum = 0;
		for(int i =0;i<3;i++) {
			System.out.println("scores["+i+"] : " +scores[i]);
			sum +=scores[i];
		}
		System.out.println("���� : " +sum);
		double avg = (double)sum/3;
		System.out.println("��� : " +avg);
		
		
		

	}

}
