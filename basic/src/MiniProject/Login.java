package MiniProject;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Login {
	Scanner scanner = new Scanner(System.in);
	List<LoginVO> login = new ArrayList<LoginVO>();
	boolean change = true;
	String line = "----------------------------------------------";
	
	void write() throws IOException {
		 File file = new File("c:/Temp/loginservice.txt");
		 FileWriter fw = new FileWriter(file);
		 for(int i =0; i<login.size();i++) {
				LoginVO lg = login.get(i);
				fw.write(lg.getID()+",\t"+lg.getPassWord()+"\n");	
			}
			fw.flush();
			fw.close();
	}
	void read() throws IOException {
		File fr = new File("c:/Temp/loginservice.txt");
		File fr2 = new File("c:/Temp/");
		if(!fr.exists()) {
//			System.out.println("읽어올 파일이 없습니다.");
			fr2.mkdirs();   
			FileWriter fw = new FileWriter(fr);
//			System.out.println("파일 생성 ");
			fw.close();
		}
		FileReader frs = new FileReader(fr);
		BufferedReader br = new BufferedReader(frs);
		String lineString;
		 while((lineString = br.readLine()) != null) {
			 String[] text = lineString.split(",");
			 login.add(new LoginVO(text[0], text[1]));
		 }
		
	}
	 void login() throws IOException {
		
		 System.out.println(line);
		 System.out.println();
		 System.out.println("\t자바세계에 오신것을 환용합니다.");
		 System.out.println();
		 System.out.println(line);
		 System.out.println();
		 System.out.println("     <Press any key to continue>");
		 String up = scanner.nextLine();
		while(change) {
			
			System.out.println("1.로그인\t2.회원가입");
			String no3 =scanner.nextLine();
			switch(no3) {
				case "1" :	
					System.out.println("ID를 입력해주세요.");
					String no4 = scanner.nextLine();
					System.out.println("password를 등록해주세오.");
					String no5 = scanner.nextLine();
					int k =0;
					for(int i =0; i<login.size(); i++) {
						 LoginVO lg = login.get(i);
						if(lg.getID().equals(no4)&&lg.getPassWord().equals(no5)) {
							k=1;
						} 
					}
					if(k==1) {
						System.out.println("로그인이 완료되었습니다.");
						System.out.println();
						System.out.println("메뉴로 들어갑니다.");
						change =false;						
					} else {
						System.out.println("아이디 또는 비번이 일치하지 않습니다.");
					}
					break;
					
				case "2" :	
					log : while(true) {
					System.out.println("회원가입 할 ID를 등록해주세요.");
					String ID = scanner.nextLine();
					read();
					for(int i =0; i<login.size();i++) {
						LoginVO str = login.get(i);
						
						if(str.getID().equals(ID)) {
							
							System.out.println("이미 등록된 ID입니다.");
							continue log;
						}else {
						}
					}
					System.out.println("회원가입 할 password를 등록해주세오.");
					String password = scanner.nextLine();
					login.add(new LoginVO(ID, password));	
					System.out.println("가입이 완료되었습니다.");
					System.out.println(line);
					System.out.println();
					write();
					break;
					}
			}
		}
	 }
}
