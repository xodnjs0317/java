package fun;

	import java.util.Arrays;
	import java.util.Formatter;

	/**
	 * 중복없는 로또번호를 생성하여 배열에 담기
	 * 1~45번 중의 6개 번호
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
			System.out.println("시도횟수 : " + cnt);
			System.out.println("총 소요금액 :" +(cnt*1000) + "원");
			
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
	

