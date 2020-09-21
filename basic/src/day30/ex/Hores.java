package day30.ex;

import java.util.Random;

public class Hores extends Thread{
	Hores(String name) {
		super(name);
	}
	
	int distance = 10;
	public void run() {
		Random r = new Random();
		while(true) {
			//distance +=1000;
			distance += r.nextInt(90)+11;
			System.out.println(this.getName()+"말은 현재"+distance/100 +"m 입니다.");
			try {
				Thread.sleep(200);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			if(distance>=10000) break;
		}
		System.out.println(this.getName()+"말이 도착 !");
	}
}
