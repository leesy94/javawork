package obj01;

import java.util.Scanner;


public class exam01 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열을 입력해주세요 : ");
		String str = scan.next();
		//System.out.println("문자열은"+str);
		
		int num = 4 ;
		
		while(true) {
			System.out.print("반목문을 이용한 선택 메뉴(1~4 사이 입력) : ");
			num = scan.nextInt();
			
			////case문으로 해도됨
			/*if(num == 1) {
				System.out.println("<모든문자를 대문자로 변환>");
				System.out.println(toUpper(str));
			}else if(num == 2) {
				System.out.println("<모든열에서 문자가 몇 번 출현하는지 횟수 반환>");
				System.out.print("횟수 체크 할 문자입력 :  ");
				char ch = scan.next().charAt(0);
			    System.out.println(charCount(str,ch));
			}else if(num == 3) {
				System.out.println("<글자 변경하기>");
				System.out.print("바꿀 문자 입력 :  ");
				String old = scan.next();
				System.out.print("변활 할 문자 입력 :  ");
				String newstr = scan.next();
				System.out.println(strReplace(str,old,newstr));
			}else if(num == 0) {
				System.out.println("<프로그램 끝내기>");
				return;
			}else {
				System.out.println("메뉴가 없습니다. 다시 입력해주세요.");
			}*/
			switch(num) {
				case 1 : 
					System.out.println("<모든문자를 대문자로 변환>");
					System.out.println(toUpper(str));
					break;
				case 2 : 
					System.out.println("<모든열에서 문자가 몇 번 출현하는지 횟수 반환>");
					System.out.print("횟수 체크 할 문자입력 :  ");
					char ch = scan.next().charAt(0);
				    System.out.println(charCount(str,ch));
					break;
				case 3 : 
					System.out.println("<글자 변경하기>");
					System.out.print("바꿀 문자 입력 :  ");
					String old = scan.next();
					System.out.print("변활 할 문자 입력 :  ");
					String newstr = scan.next();
					System.out.println(strReplace(str,old,newstr));
					break;
				case 0 : 
					System.out.println("<프로그램 끝내기>");
					return;
				default :
					System.out.println("메뉴가 없습니다. 다시 입력해주세요.");
			
			}
			
		}
	}
	public static String toUpper(String str) {
		String upper = str.toUpperCase() ;
        return upper;
	}
	
	public static int charCount(String str, char ch) {
		char targetChar = ch;
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == targetChar) {
                count++;
            }
        }
        return count;
	}
	
	public static String strReplace(String str, String old, String newStr) {
		String replacestr = str.replace(old, newStr);
		return replacestr;
	}


}
