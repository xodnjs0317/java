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
//			System.out.println("�о�� ������ �����ϴ�.");
			fr2.mkdirs();   
			FileWriter fw = new FileWriter(fr);
//			System.out.println("���� ���� ");
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
		 System.out.println("\t�ڹټ��迡 ���Ű��� ȯ���մϴ�.");
		 System.out.println();
		 System.out.println(line);
		 System.out.println();
		 System.out.println("     <Press any key to continue>");
		 String up = scanner.nextLine();
		while(change) {
			
			System.out.println("1.�α���\t2.ȸ������");
			String no3 =scanner.nextLine();
			switch(no3) {
				case "1" :	
					System.out.println("ID�� �Է����ּ���.");
					String no4 = scanner.nextLine();
					System.out.println("password�� ������ּ���.");
					String no5 = scanner.nextLine();
					int k =0;
					for(int i =0; i<login.size(); i++) {
						 LoginVO lg = login.get(i);
						if(lg.getID().equals(no4)&&lg.getPassWord().equals(no5)) {
							k=1;
						} 
					}
					if(k==1) {
						System.out.println("�α����� �Ϸ�Ǿ����ϴ�.");
						System.out.println();
						System.out.println("�޴��� ���ϴ�.");
						change =false;						
					} else {
						System.out.println("���̵� �Ǵ� ����� ��ġ���� �ʽ��ϴ�.");
					}
					break;
					
				case "2" :	
					log : while(true) {
					System.out.println("ȸ������ �� ID�� ������ּ���.");
					String ID = scanner.nextLine();
					read();
					for(int i =0; i<login.size();i++) {
						LoginVO str = login.get(i);
						
						if(str.getID().equals(ID)) {
							
							System.out.println("�̹� ��ϵ� ID�Դϴ�.");
							continue log;
						}else {
						}
					}
					System.out.println("ȸ������ �� password�� ������ּ���.");
					String password = scanner.nextLine();
					login.add(new LoginVO(ID, password));	
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					System.out.println(line);
					System.out.println();
					write();
					break;
					}
			}
		}
	 }
}
