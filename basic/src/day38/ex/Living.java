package day38.ex;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Living {
	public static void main(String[] args) throws Exception{
		boolean run = true;
		int count=0;
		String city;
		Scanner scanner = new Scanner(System.in);
		String text= "���ڹ�:����Ư����"
				+ "\n"+"���ѱ�:������\n"+"��ö��:��û�ϵ�\n"+"�̵��:��û����\n";
		String[] names = text.split(":");
		StringBuilder sb = new StringBuilder();
		List<LivingVO> list  = new ArrayList<LivingVO>();
		String location = "����Ư����";
		String name = "���ڹ�";
		list.add(new LivingVO(name,location));
		
		location = "������";
		name = "���ѱ�";
		list.add(new LivingVO(name,location));
		
		location = "��û�ϵ�";
		name = "��ö��";
		list.add(new LivingVO(name,location));
		
		location = "��û����";
		name = "�̵��";
		list.add(new LivingVO(name,location));
		
		while(run) {
			System.out.println("�׸��� �����ϼ���.(1.������ \t2.�̸�\t3.����):");
			
			int selectNo = scanner.nextInt();
			scanner.nextLine();
			if(selectNo==1) {
				System.out.println("�������� �Է��ϼ���.");
				city = scanner.nextLine();
				
				for(int i=0; i<list.size();i++) {
					LivingVO str = list.get(i);
					if(str.getLocation().equals(city)) {
						count++;
					System.out.println(city+"�˻��Ȱ�� : "+"  "+count +"��");
					System.out.print("�̸� : "+str.getName()+"\t"+"������ :"+str.getLocation()+"\n");
					System.out.println();
					sb.append(city+"�˻��Ȱ�� : "+"  "+count +"��\n");
					sb.append("�̸� : "+str.getName()+"\t"+"������ :"+str.getLocation());
					sb.append("\n");
					sb.append("--------------------------\n");
					}
				}
				count=0;
		}
			if(selectNo==2) {
				System.out.println("�̸��� �Է��ϼ��� : ");
				name = scanner.nextLine();
				
			for(int i=0;i<list.size();i++) {
				LivingVO str= list.get(i);
					if(name.equals(str.getName().substring(0,1))) {
						count++;
					}
			}
			System.out.println(name+"�˻��Ȱ�� : "+"  "+count +"��");
			sb.append("'"+name+"'"+"�˻��Ȱ�� : "+"  "+count +"��");
			sb.append("\n");
			count=0;
			for(int n= 0; n<list.size();n++) {
				LivingVO str =list.get(n);
				if(name.equals(str.getName().substring(0,1))) {
					System.out.println("�̸� : "+str.getName()+"\t"+"������ :"+str.getLocation()+"\n");
					sb.append("�̸� : "+str.getName()+"\t"+"������ :"+str.getLocation()+"\n");
					sb.append("\n");
				}
			}
		}
		if(selectNo==3) {
			System.out.println("�˻��� ����� ���� �� �����Ͻðڽ��ϱ�?(Y/N)");
			String result = scanner.nextLine();
			switch(result) {
			case "N" : System.out.println("���α׷��� �����մϴ�.");
				break;
			case "Y" :  File file = new File("C:/Temp/searchResult.txt");
						FileWriter fw = new FileWriter(file , true);
						
						fw.write(sb.toString());
						fw.flush();
						fw.close();
					   System.out.println("�˻������ ����Ǿ����ϴ�.");
					   System.out.println("���α׷��� �����մϴ�.");
				break;
			 default :System.out.println("�ٽ� �Է� �ٶ��ϴ�.");
			
			}
			 run =false;
		}
	}
}
}
