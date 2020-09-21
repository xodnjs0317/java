package jdbc;

import java.util.Scanner;

import MiniProject.MiniMainDAO;

public class t_boardMain {
	public static void main(String[] args) {
		
		t_boardDAO t_boardDao = new t_boardDAO();
		Scanner sc = new Scanner(System.in);
		MiniMainDAO miniDao = new MiniMainDAO();
		
		
		
		switch(sc.nextLine()) {
		case "1" :
				  t_boardDao.select();
					break;
		case "2" :			
				  miniDao.insert();
					break;
		case "3" :
				 t_boardDao.delete();
				 	break;
		case "4" :
				t_boardDao.update();
					break;
		}
		
	}
}
