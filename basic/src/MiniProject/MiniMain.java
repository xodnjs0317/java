package MiniProject;

import java.io.IOException;
import java.util.Scanner;

public class MiniMain {
public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		MiniMainDAO miniDao = new MiniMainDAO();
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
