package ex01_Exception;

public class Ch04_NumberFormatException {

	public static void main(String[] args) {
		String strNum[] = {"111","32","333.2234"};
		int i = 0 ;
		try {
			//for(String num: strNum) {
			for(i = 0;i < strNum.length;i++) {			
				//int result = Integer.parseInt(num) ;
				int result = Integer.parseInt(strNum[i]) ;
				System.out.println("int 변홤 : " + result);
			}
		}catch(NumberFormatException ne) {
			System.out.println("숫자로 변경 불가 " + strNum[i]);
		}
	}

}
