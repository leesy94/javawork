package exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {
		int select ; //사용자로부터 입력받은 선택번호
		boolean check = false; //로그인 되었는지 체크
		ArrayList<Grade> glist = new ArrayList<Grade>(); //학생정보 및 점수를 입력받아 저장
		int gListIndex = 0 ; //로그인 된 후 출력시 필요한 index번호
		String logid = null ;
		
		Grade grade = new Grade();
	
		Scanner scan = new Scanner(System.in);
		
		HashMap<String,String> hm = new HashMap<>();
		grade = new Grade("111","111","111",111,11,22,33,45);
		glist.add(grade);
		
		hm.put("111","111");
		
		while(true) {
			System.out.println("==============================");
			System.out.println("1. 학생 정보 및 점수 입력");
			System.out.println("2. login(출력은 login이 되어야만 출력가능)");
			System.out.println("3. 학생 정보 출력");
			System.out.println("4. 합계와 평균 출력");
			System.out.println("5. logout");
			System.out.println("6. 프로그램 종료");
			System.out.println("------------------------------");
			System.out.print("번호를 선택하세요 : ");
			select = scan.nextInt();
			
			switch(select) {
				case  1 : 
					System.out.print("id 입력 : ");
					String id = scan.next();
					System.out.print("이름 입력 : ");
					String name = scan.next();
					System.out.print("비밀번호 입력 : ");
					String pw = scan.next();
					System.out.print("나이 입력 : ");
					int age = scan.nextInt();
					
					System.out.print("국어점수 입력 : ");
					int kor = scan.nextInt();
					System.out.print("영어점수 입력 : ");
					int eng = scan.nextInt();
					System.out.print("컴퓨터점수 입력 : ");
					int com = scan.nextInt();
					System.out.print("수학점수 입력 : ");
					int math = scan.nextInt();
					
					Grade grd = new Grade(id,name,pw,age,kor,eng,com,math);
					
					glist.add(grd);
					
					hm.put(id,pw);
					break ;
				case  2 : 
					int count = 1;
					
					while(true) {	
						System.out.print("ID를 입력해주세요 : ");
						String hmid = scan.next();
						System.out.print("PASSWORD를 입력해주세요 : ");
						String hmpw = scan.next();
			
						if(count > 2) {
							System.out.println("3번의 로그인에 실패하였습니다. 본인확인이 필요합니다.");
							return;
						}else {
							if(hm.containsKey(hmid)) {
								String value = (String)hm.get(hmid);
								//System.out.println(value);
								if(value.equals(hmpw)) {
									System.out.println("로그인 되었습니다.");
									check = true;
									logid = hmid;
									break ;
								}else {
									System.out.println("ID또는 PASSWORD가 틀렸습니다. 다시 입력하세요.");
									count += 1;
								}
							}else {
								System.out.println("ID또는 PASSWORD가 틀렸습니다. 다시 입력하세요.");
								count += 1;
							}
						}
					}
					
				case  3 : 
					if(check == false) {
						System.out.println("로그인 후에만 출력가능합니다.");
					}else {
						for(int i = 0 ; i < glist.size() ; i++) {
							if(glist.get(i).getId().equals(logid)) {
								System.out.println(glist.get(i).getName()+"의 정보 "+glist.get(i));
							}else {
								
							}
						}
					}
					break ;
				case  4 : 		
					//System.out.println(grade.kor);
					System.out.println("합계 : "+grade.getTotalScore());
					System.out.printf("평균 : %.1f\n" , grade.getAvg());
					break ;
				case  5 : 
					check = false;
					logid = null;
					System.out.println("로그아웃 되었습니다.");
					break ;
				case  6 : 
					System.out.println("프로그램 종료");
					return ;
		
			}
		}
	
	}
	
}

