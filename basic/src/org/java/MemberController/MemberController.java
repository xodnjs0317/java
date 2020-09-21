package org.java.MemberController;

import java.util.Scanner;

import org.java.MemberCommend.ActionDeleteDo;
import org.java.MemberCommend.ActionInsertDo;
import org.java.MemberCommend.ActionSelectDo;
import org.java.MemberCommend.ActionUpdateDo;

public class MemberController {
	
	public static void main(String[] args) {
		
		ActionDeleteDo ad = new ActionDeleteDo();
		ActionInsertDo ai = new ActionInsertDo();
		ActionSelectDo as = new ActionSelectDo();
		ActionUpdateDo au = new ActionUpdateDo();
		Scanner in = new Scanner(System.in);
		
		System.out.println("필요하신것을 넣어주세요>");
		String tw = in.nextLine();
		
		if(tw.equals("insert")){
			ai.excuteQuery();
		}else if(tw.equals("delete")){
			ad.excuteQuery();
		}else if(tw.equals("select")){
			as.excuteQuery();
		}else if(tw.equals("update")){
			au.excuteQuery();
		}
		
		
	
		
		
				
		
	}

}
