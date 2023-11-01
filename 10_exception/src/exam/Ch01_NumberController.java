package exam;

public class Ch01_NumberController {
	Ch01_NumberController() {}
	public static void check(int num1, int num2) throws Ch01_NumRangeException {
		boolean result;
		if(num1 > 0 && num1 <= 100 && num2 > 0 && num2 <= 100) {
			if(num1 < num2) {
				throw new Ch01_NumRangeException(num1+"dl "+num2+"보다 작습니다.");
			}else {
				if(num1 % num2 == 0) {
					result = true;		
				}else {
					result = false;
				}
				throw new Ch01_NumRangeException(num1+"은(는) "+num2+"의 배수인가? "+result);
			}
			
		}else {
			throw new Ch01_NumRangeException(num1+" 또는 "+num2+"이(가) 1~100사이의 정수가 아닙니다.");
		}
	}
}
