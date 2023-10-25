package obj03_Method;

public class Ch04_method_tv {
	String com = "LG" ;
	String model = "ULTRA 4DK 어쩌구" ;
	int inch = 70;
	int val;
	int ch;
	boolean turn ;
	
	void tvturn() {		
		if(!turn) {
			System.out.println("널 너무나 사랑해서 tv를 켰어");
		}else {
			System.out.println("널 너무나 사랑해서 tv를 껐어");
		}
		turn = !turn ;
	}
	
	int chup() {
		ch += 2 ;
		return ch;
	}
	int chdown() {
		if(ch > 2) 
			ch -= 2 ;			
		else 
			ch = 1 ;
		
		return ch;
	}
	
	int valum(int vm) {
		this.val = vm ;
		return this.val; 
	}
	
	
}
