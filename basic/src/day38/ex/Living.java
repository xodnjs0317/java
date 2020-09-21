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
		String text= "이자바:서울특별시"
				+ "\n"+"강한길:강원도\n"+"안철수:충청북도\n"+"이디비:충청남도\n";
		String[] names = text.split(":");
		StringBuilder sb = new StringBuilder();
		List<LivingVO> list  = new ArrayList<LivingVO>();
		String location = "서울특별시";
		String name = "이자바";
		list.add(new LivingVO(name,location));
		
		location = "강원도";
		name = "강한길";
		list.add(new LivingVO(name,location));
		
		location = "충청북도";
		name = "안철수";
		list.add(new LivingVO(name,location));
		
		location = "충청남도";
		name = "이디비";
		list.add(new LivingVO(name,location));
		
		while(run) {
			System.out.println("항목을 선택하세요.(1.지역명 \t2.이름\t3.종료):");
			
			int selectNo = scanner.nextInt();
			scanner.nextLine();
			if(selectNo==1) {
				System.out.println("지역명을 입력하세요.");
				city = scanner.nextLine();
				
				for(int i=0; i<list.size();i++) {
					LivingVO str = list.get(i);
					if(str.getLocation().equals(city)) {
						count++;
					System.out.println(city+"검색된결과 : "+"  "+count +"명");
					System.out.print("이름 : "+str.getName()+"\t"+"거주지 :"+str.getLocation()+"\n");
					System.out.println();
					sb.append(city+"검색된결과 : "+"  "+count +"명\n");
					sb.append("이름 : "+str.getName()+"\t"+"거주지 :"+str.getLocation());
					sb.append("\n");
					sb.append("--------------------------\n");
					}
				}
				count=0;
		}
			if(selectNo==2) {
				System.out.println("이름을 입력하세요 : ");
				name = scanner.nextLine();
				
			for(int i=0;i<list.size();i++) {
				LivingVO str= list.get(i);
					if(name.equals(str.getName().substring(0,1))) {
						count++;
					}
			}
			System.out.println(name+"검색된결과 : "+"  "+count +"명");
			sb.append("'"+name+"'"+"검색된결과 : "+"  "+count +"명");
			sb.append("\n");
			count=0;
			for(int n= 0; n<list.size();n++) {
				LivingVO str =list.get(n);
				if(name.equals(str.getName().substring(0,1))) {
					System.out.println("이름 : "+str.getName()+"\t"+"거주지 :"+str.getLocation()+"\n");
					sb.append("이름 : "+str.getName()+"\t"+"거주지 :"+str.getLocation()+"\n");
					sb.append("\n");
				}
			}
		}
		if(selectNo==3) {
			System.out.println("검색된 결과를 저장 후 종료하시겠습니까?(Y/N)");
			String result = scanner.nextLine();
			switch(result) {
			case "N" : System.out.println("프로그램을 종료합니다.");
				break;
			case "Y" :  File file = new File("C:/Temp/searchResult.txt");
						FileWriter fw = new FileWriter(file , true);
						
						fw.write(sb.toString());
						fw.flush();
						fw.close();
					   System.out.println("검색결과가 저장되었습니다.");
					   System.out.println("프로그램을 종료합니다.");
				break;
			 default :System.out.println("다시 입력 바랍니다.");
			
			}
			 run =false;
		}
	}
}
}
