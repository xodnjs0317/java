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
		System.out.println("1.전체 조회");
		System.out.println("2.이름명 조회");
		System.out.println("3.지역별 조회");
		System.out.println("4.헬스장 등록");
		System.out.println("5.검색 목록 삭제");
		System.out.println("6.검색 목록 수정하기");
		System.out.println("7.검색 목록 저장");
		System.out.println("8.검색 목록 불러오기");
		System.out.println("9.종료");
		System.out.println(line);
		System.out.println("선택 >>");
		System.out.println();
	}
	@Override
	public void register() {
		while(run) {
		 System.out.println("지역을 설정해주세요.");
		 System.out.println("1.도봉\t 2.강북\t 3.성북\t 4.노원\t 5.강동");
		 System.out.println("6.송파\t 7.서초\t 8.강남\t 9.동대문\t 10.중랑");
		 System.out.println("11.성동\t 12.광진\t 13.종로\t 14.종구\t 15.용산");
		 System.out.println("16.동작\t 17.관악\t 18.금천\t 19.강서\t 20.양천");
		 System.out.println("21.영등포\t 22.구로\t 23.은평\t 24.마포\t 25.서대문");
		 System.out.print("선택 >>");
		 int num = scanner.nextInt();
		 String location = null;
		 if(num==1) {
			 System.out.println("도봉");
			 location = "도봉";
		 } else if(num==2) {
			 System.out.println("강북");
			 location= "깅븍";
		 } else if(num==3) {
		     System.out.println("성북");
		     location= "성북";
	     } else if(num==4) {
			 System.out.println("노원");
			 location= "노원";
		 } else if(num==5) {
		     System.out.println("강동");
		     location= "강동";
	     }else if(num==6) {
			 System.out.println("송파");
			 location= "송파";
		 } else if(num==7) {
		     System.out.println("서초");
		     location= "서초";
	     }else if(num==8) {
			 System.out.println("강남");
			 location= "강남";
		 } else if(num==9) {
		     System.out.println("동대문");
		     location= "동대문";
	     }else if(num==10) {
			 System.out.println("중랑");
			 location= "중랑";
		 } else if(num==11) {
		     System.out.println("성동");
		     location= "성동";
	     }else if(num==12) {
			 System.out.println("광진");
			 location= "광진";
		 } else if(num==13) {
		     System.out.println("종로");
		     location= "종로";
	     }else if(num==14) {
			 System.out.println("중구");
			 location= "중구";
		 } else if(num==15) {
		     System.out.println("용산");
		     location= "용산";
	     }else if(num==16) {
			 System.out.println("동작");
			 location= "동작";
		 } else if(num==17) {
		     System.out.println("관악");
		     location= "관악";
	     }else if(num==18) {
			 System.out.println("금천");
			 location= "금천";
		 } else if(num==19) {
		     System.out.println("강서");
		     location= "강서";
	     }else if(num==20) {
			 System.out.println("양천");
			 location= "양천";
		 } else if(num==21) {
		     System.out.println("영등포");
		     location= "영등포";
	     }else if(num==22) {
			 System.out.println("구로");
			 location= "구로";
		 } else if(num==23) {
		     System.out.println("은평");
		     location= "은평";
	     }else if(num==24) {
			 System.out.println("마포");
			 location= "마포";
		 } else if(num==25) {
		     System.out.println("서대문");
		     location= "서대문";
	     } else {
	    	 System.out.println("다시입력해주세요.");
	    	 System.out.println();
	    	 continue;
	     }
		 
		scanner.nextLine();
		System.out.println("헬스장 명을 적어주세요.");
		String name = scanner.nextLine();
		System.out.println("전화번호를 등록해주세요");
		String number = scanner.nextLine();
		System.out.println("등록이 완료 되었습니다.");
		list.add(new MainVO(no++,location,name, number));
		System.out.println();
			System.out.println("추가 하시겠습니까?(네/아니오)");
			String result = scanner.nextLine();
			if(result.equals("아니오")) {
				 break;
			}else if(result.equals("네")) {
				
			}else {
				System.out.println("다시 입력해주세요.");
				System.out.println();
			}
		}
	}
	@Override
	public void chart() {
		System.out.println("\t--조희된 결과--");
		System.out.println("순번\t위치\t이름\t전화번호");
		System.out.println(line);
		for(int i=0;i<list.size();i++) {
			MainVO str = list.get(i);
			System.out.println((str.getNo())+"\t"+str.getLocation()+"\t"+str.getName()+"\t"+str.getNumber());
		}
	}
	@Override
	public void chart2() {  
		System.out.println("이름을 입력해주세요.");
		count=0;
		names= scanner.nextLine();
		for(int i=0;i<list.size();i++) {
			MainVO str = list.get(i);
			if(str.getName().contains(names)) {
				count++;
			}
		}
		System.out.println("\t--'"+names+"'"+"검색된결과 : "+count +"곳--");
		System.out.println();
		System.out.println("순번\t위치\t이름\t전화번호");
		for(int i =0; i<list.size();i++) {
			MainVO str =list.get(i);
		if(str.getName().contains(names)) {
				System.out.println(str.getNo()+"\t"+str.getLocation()+"\t"+str.getName()+"\t"+str.getNumber());
			}
		}
	}
	@Override
	public void chart3() {
		System.out.println("지역을 입력해주세요.");
		count = 0;
		city = scanner.nextLine();
		for(int i =0; i<list.size();i++) {
			MainVO str = list.get(i);
			if(str.getLocation().contains(city)) {
				count++;
			}
		}
		System.out.println("\t--'"+city+"'"+"로 검색된결과"+count+"곳--");
		System.out.println();
		System.out.println("순번\t위치\t이름\t전화번호");
		for(int n =0; n<list.size();n++) {
			MainVO str =list.get(n);
			if(str.getLocation().contains(city)) {
				System.out.println(str.getNo()+"\t"+str.getLocation()+"\t"+str.getName()+"\t"+str.getNumber());
			}
		}
	}
	@Override
	public void chart5() {
		System.out.println("\t--삭제할 목록을 선택해주세요--");
		System.out.println("순번\t위치\t이름\t전화번호");
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
		System.out.println("삭제 되었습니다.");
		System.out.println();
	}
	@Override
	public void chart6() {
		System.out.println("수정할 목록을 선택해주세요.");
		chart();
		no = scanner.nextInt();
		scanner.nextLine();
		for(int i=0;i<list.size(); i++) {
			MainVO str = list.get(i);
			if(str.getNo()== no) {
				System.out.println("위치를 수정해주세요");
				str.setLocation(scanner.nextLine());
				System.out.println("이름을 입력해주세요.");
				str.setName(scanner.nextLine());
				System.out.println("전화번호를 수정해주세요.");	
				str.setNumber(scanner.nextLine());
			}
		}
	 System.out.println("수정이 완료되었습니다.");
		}
	void chart7() throws IOException {
		System.out.println("검색된 결과를 저장 하시겠습니까?(Y/N)");
		String result= scanner.nextLine();
		switch(result) {
		case "Y": File file = new File("c:/Temp/healty.csv");
				  FileWriter fw = new FileWriter(file);
				  fw.write("순번\t,위치\t,이름\t,전화번호\r\n");
				  fw.write(line+"\n");
				  System.out.println();
				  for(int i=0; i<list.size();i++) {
				  MainVO str = list.get(i);
				  
				  fw.write(str.getNo()+",\t"+str.getLocation()+",\t"+str.getName()+",\t"+str.getNumber()+"\r\n");
				  System.out.println();
			}
				  fw.flush();
				  fw.close();
				  System.out.println("저장이 완료되었습니다.");    
				  System.out.println();
			break;
		case "N": System.out.println("메뉴로 돌아갑니다.");
		          System.out.println();
		          
			break;
		default : System.out.println("다시 입력 바랍니다.");
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
		 System.out.println("순번\t위치\t이름\t전화번호\r\n");
		 System.out.println(line);
		 for(int i=0; i<list.size();i++) {
			 MainVO str =  list.get(i);
			 System.out.println(str.getNo()+"\t"+str.getLocation()+"\t"+str.getName()+"\t"+str.getNumber());

		 }
		 fr.close();
		 System.out.println();
		 System.out.println("저장된 내용을 불러옵니다.");
		 System.out.println();
	}
	 boolean chart9() {
		 	System.out.println("시스템을 종료하시겠습니까?(Y/N)");
		 	String enter = scanner.nextLine();		
		 	switch(enter) {
		 	case "N" :  System.out.println("초기화면으로 돌아갑니다.");
		 				return true;
		 	case "n" :	System.out.println("초기화면으로 돌아갑니다.");   
						return true;
		 	case "Y" :	System.out.println("프로그램을 종료합니다.");
		 				return false;
		 	case "y" :	System.out.println("프로그램을 종료합니다.");
		 				return false;
		 	default :
		 			System.out.println("잘못누르셨습니다.");
		 			return true;
		 					
		 	}
		 	
	}
}
