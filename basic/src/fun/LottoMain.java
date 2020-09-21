package fun;

	import java.util.Arrays;
	import java.util.Formatter;

	/**
	 * �ߺ����� �ζǹ�ȣ�� �����Ͽ� �迭�� ���
	 * 1~45�� ���� 6�� ��ȣ
	 *
	 */
	public class LottoMain {
		static int[] myresult = new int[6];
		public static void main(String[] args) {
			int[] lotto = new int[]{5, 8, 18, 1, 22, 38};
			Arrays.sort(lotto);
			boolean run = true;
			int cnt = 1;
			int money = 0;
			while(run) {
				int check =0;
				Arrays.sort(myresult);
				System.out.println(Arrays.toString(myresult));
				for(int i=0; i<lotto.length;i++) {
					if(myresult[i]==lotto[i])
						check++;
					else
						random();
					
				}
				cnt++;
				money +=1000;
				if(check==6) {
					System.out.println("myresult" + Arrays.toString(myresult));
					System.out.println("lotto " + Arrays.toString(lotto));
					run = false;
				}
			}
			System.out.println("�õ�Ƚ�� : " + cnt);
			System.out.println("�� �ҿ�ݾ� :" +(cnt*1000) + "��");
			
		}
		public static void random() {
			int index=0;
			while(true) {
				int num = (int)(Math.random()*45)+1;
				for(int one : myresult) {
					if(one == num) {
						break;
					} else {
						myresult[index] = num;
						++index;
						break;
					}
				}
				if(index == myresult.length) {
					break;
				}
				
			}
			
		}
	}
	

