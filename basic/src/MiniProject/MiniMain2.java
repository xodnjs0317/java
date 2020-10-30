package MiniProject;

import java.io.IOException;
import java.util.Scanner;

public class MiniMain2 {
public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		MiniMainDAO2 miniDao = new MiniMainDAO2();
		Login lo = new Login();
		
		boolean run = true;
	
		lo.login();
		while(run) {
				miniDao.come();
		switch(sc.nextLine()) {
		case "1" :
				miniDao.select();
					break;
		case "2" :			
				miniDao.insert();
					break;
		case "3" :
				miniDao.update();				
				 	break;
		case "4" :
				miniDao.delete();
					break;
		}
	}run = false;
}
}
