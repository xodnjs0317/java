package MiniProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day38.ex.LivingVO;

public class MainFunction implements SearchService{
	
	String line = "--------------------------------------------";
	Scanner scanner = new Scanner(System.in);
	List<MainVO> list = new ArrayList<MainVO>();
	String names;
	String city;
	int count=0;
	String tel;
	int no =1;
	boolean run = true;
	@Override
	public void menu() {
		System.out.println(line);
		System.out.println("1.��ü ��ȸ");
		System.out.println("2.�̸��� ��ȸ");
		System.out.println("3.������ ��ȸ");
		System.out.println("4.�ｺ�� ���");
		System.out.println("5.�˻� ��� ����");
		System.out.println("6.�˻� ��� �����ϱ�");
		System.out.println("7.�˻� ��� ����");
		System.out.println("8.�˻� ��� �ҷ�����");
		System.out.println("9.����");
		System.out.println(line);
		System.out.println("���� >>");
		System.out.println();
	}
	@Override
	public void register() {
		while(run) {
		 System.out.println("������ �������ּ���.");
		 System.out.println("1.����\t 2.����\t 3.����\t 4.���\t 5.����");
		 System.out.println("6.����\t 7.����\t 8.����\t 9.���빮\t 10.�߶�");
		 System.out.println("11.����\t 12.����\t 13.����\t 14.����\t 15.���");
		 System.out.println("16.����\t 17.����\t 18.��õ\t 19.����\t 20.��õ");
		 System.out.println("21.������\t 22.����\t 23.����\t 24.����\t 25.���빮");
		 System.out.print("���� >>");
		 int num = scanner.nextInt();
		 String location = null;
		 if(num==1) {
			 System.out.println("����");
			 location = "����";
		 } else if(num==2) {
			 System.out.println("����");
			 location= "���";
		 } else if(num==3) {
		     System.out.println("����");
		     location= "����";
	     } else if(num==4) {
			 System.out.println("���");
			 location= "���";
		 } else if(num==5) {
		     System.out.println("����");
		     location= "����";
	     }else if(num==6) {
			 System.out.println("����");
			 location= "����";
		 } else if(num==7) {
		     System.out.println("����");
		     location= "����";
	     }else if(num==8) {
			 System.out.println("����");
			 location= "����";
		 } else if(num==9) {
		     System.out.println("���빮");
		     location= "���빮";
	     }else if(num==10) {
			 System.out.println("�߶�");
			 location= "�߶�";
		 } else if(num==11) {
		     System.out.println("����");
		     location= "����";
	     }else if(num==12) {
			 System.out.println("����");
			 location= "����";
		 } else if(num==13) {
		     System.out.println("����");
		     location= "����";
	     }else if(num==14) {
			 System.out.println("�߱�");
			 location= "�߱�";
		 } else if(num==15) {
		     System.out.println("���");
		     location= "���";
	     }else if(num==16) {
			 System.out.println("����");
			 location= "����";
		 } else if(num==17) {
		     System.out.println("����");
		     location= "����";
	     }else if(num==18) {
			 System.out.println("��õ");
			 location= "��õ";
		 } else if(num==19) {
		     System.out.println("����");
		     location= "����";
	     }else if(num==20) {
			 System.out.println("��õ");
			 location= "��õ";
		 } else if(num==21) {
		     System.out.println("������");
		     location= "������";
	     }else if(num==22) {
			 System.out.println("����");
			 location= "����";
		 } else if(num==23) {
		     System.out.println("����");
		     location= "����";
	     }else if(num==24) {
			 System.out.println("����");
			 location= "����";
		 } else if(num==25) {
		     System.out.println("���빮");
		     location= "���빮";
	     } else {
	    	 System.out.println("�ٽ��Է����ּ���.");
	    	 System.out.println();
	    	 continue;
	     }
		 
		scanner.nextLine();
		System.out.println("�ｺ�� ���� �����ּ���.");
		String name = scanner.nextLine();
		System.out.println("��ȭ��ȣ�� ������ּ���");
		String number = scanner.nextLine();
		System.out.println("����� �Ϸ� �Ǿ����ϴ�.");
		list.add(new MainVO(no++,location,name, number));
		System.out.println();
			System.out.println("�߰� �Ͻðڽ��ϱ�?(��/�ƴϿ�)");
			String result = scanner.nextLine();
			if(result.equals("�ƴϿ�")) {
				 break;
			}else if(result.equals("��")) {
				
			}else {
				System.out.println("�ٽ� �Է����ּ���.");
				System.out.println();
			}
		}
	}
	@Override
	public void chart() {
		System.out.println("\t--����� ���--");
		System.out.println("����\t��ġ\t�̸�\t��ȭ��ȣ");
		System.out.println(line);
		for(int i=0;i<list.size();i++) {
			MainVO str = list.get(i);
			System.out.println((str.getNo())+"\t"+str.getLocation()+"\t"+str.getName()+"\t"+str.getNumber());
		}
	}
	@Override
	public void chart2() {  
		System.out.println("�̸��� �Է����ּ���.");
		count=0;
		names= scanner.nextLine();
		for(int i=0;i<list.size();i++) {
			MainVO str = list.get(i);
			if(str.getName().contains(names)) {
				count++;
			}
		}
		System.out.println("\t--'"+names+"'"+"�˻��Ȱ�� : "+count +"��--");
		System.out.println();
		System.out.println("����\t��ġ\t�̸�\t��ȭ��ȣ");
		for(int i =0; i<list.size();i++) {
			MainVO str =list.get(i);
		if(str.getName().contains(names)) {
				System.out.println(str.getNo()+"\t"+str.getLocation()+"\t"+str.getName()+"\t"+str.getNumber());
			}
		}
	}
	@Override
	public void chart3() {
		System.out.println("������ �Է����ּ���.");
		count = 0;
		city = scanner.nextLine();
		for(int i =0; i<list.size();i++) {
			MainVO str = list.get(i);
			if(str.getLocation().contains(city)) {
				count++;
			}
		}
		System.out.println("\t--'"+city+"'"+"�� �˻��Ȱ��"+count+"��--");
		System.out.println();
		System.out.println("����\t��ġ\t�̸�\t��ȭ��ȣ");
		for(int n =0; n<list.size();n++) {
			MainVO str =list.get(n);
			if(str.getLocation().contains(city)) {
				System.out.println(str.getNo()+"\t"+str.getLocation()+"\t"+str.getName()+"\t"+str.getNumber());
			}
		}
	}
	@Override
	public void chart5() {
		System.out.println("\t--������ ����� �������ּ���--");
		System.out.println("����\t��ġ\t�̸�\t��ȭ��ȣ");
		System.out.println(line);
		System.out.println();
		for(int i=0;i<list.size();i++) {
			MainVO str = list.get(i);
			System.out.println(str.getNo()+"\t"+str.getLocation()+"\t"+str.getName()+"\t"+str.getNumber());
		}
		no= scanner.nextInt();		
		for(int i=0;i<list.size();i++) {
			MainVO str = list.get(i);
			if(str.getNo()== no) {
				list.remove(i);	
			}
		}
		System.out.println("���� �Ǿ����ϴ�.");
		System.out.println();
	}
	@Override
	public void chart6() {
		System.out.println("������ ����� �������ּ���.");
		chart();
		no = scanner.nextInt();
		scanner.nextLine();
		for(int i=0;i<list.size(); i++) {
			MainVO str = list.get(i);
			if(str.getNo()== no) {
				System.out.println("��ġ�� �������ּ���");
				str.setLocation(scanner.nextLine());
				System.out.println("�̸��� �Է����ּ���.");
				str.setName(scanner.nextLine());
				System.out.println("��ȭ��ȣ�� �������ּ���.");	
				str.setNumber(scanner.nextLine());
			}
		}
	 System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		}
	void chart7() throws IOException {
		System.out.println("�˻��� ����� ���� �Ͻðڽ��ϱ�?(Y/N)");
		String result= scanner.nextLine();
		switch(result) {
		case "Y": File file = new File("c:/Temp/healty.csv");
				  FileWriter fw = new FileWriter(file);
				  fw.write("����\t,��ġ\t,�̸�\t,��ȭ��ȣ\r\n");
				  fw.write(line+"\n");
				  System.out.println();
				  for(int i=0; i<list.size();i++) {
				  MainVO str = list.get(i);
				  
				  fw.write(str.getNo()+",\t"+str.getLocation()+",\t"+str.getName()+",\t"+str.getNumber()+"\r\n");
				  System.out.println();
			}
				  fw.flush();
				  fw.close();
				  System.out.println("������ �Ϸ�Ǿ����ϴ�.");    
				  System.out.println();
			break;
		case "N": System.out.println("�޴��� ���ư��ϴ�.");
		          System.out.println();
		          
			break;
		default : System.out.println("�ٽ� �Է� �ٶ��ϴ�.");
		}
	}
	 void chart8() throws Exception{
		 list.clear();
		 File file = new File("c:/Temp/healty.txt");
		 FileReader fr = new FileReader(file);
		 BufferedReader br = new BufferedReader(fr);
		 String lineString = br.readLine();
		  lineString = br.readLine();
//		 String lineString = null;
		 while((lineString = br.readLine()) != null) {
			 String[] text = lineString.split(",");
			 list.add(new MainVO(Integer.parseInt(text[0]), text[1].trim(), text[2].trim(), text[3].trim()));
		 }
		 System.out.println("����\t��ġ\t�̸�\t��ȭ��ȣ\r\n");
		 System.out.println(line);
		 for(int i=0; i<list.size();i++) {
			 MainVO str =  list.get(i);
			 System.out.println(str.getNo()+"\t"+str.getLocation()+"\t"+str.getName()+"\t"+str.getNumber());

		 }
		 fr.close();
		 System.out.println();
		 System.out.println("����� ������ �ҷ��ɴϴ�.");
		 System.out.println();
	}
	 boolean chart9() {
		 	System.out.println("�ý����� �����Ͻðڽ��ϱ�?(Y/N)");
		 	String enter = scanner.nextLine();		
		 	switch(enter) {
		 	case "N" :  System.out.println("�ʱ�ȭ������ ���ư��ϴ�.");
		 				return true;
		 	case "n" :	System.out.println("�ʱ�ȭ������ ���ư��ϴ�.");   
						return true;
		 	case "Y" :	System.out.println("���α׷��� �����մϴ�.");
		 				return false;
		 	case "y" :	System.out.println("���α׷��� �����մϴ�.");
		 				return false;
		 	default :
		 			System.out.println("�߸������̽��ϴ�.");
		 			return true;
		 					
		 	}
		 	
	}
}
