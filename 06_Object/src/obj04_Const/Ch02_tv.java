package obj04_Const;

public class Ch02_tv {
	String com = "LG" ;
	String model = "ULTRA 4DK 어쩌구" ;
	int inch = 70;
	int val;
	int ch;
	boolean turn ;
	String turn2 ;
	
	
	Ch02_tv(String com , String model , int inch,int val,int ch,boolean turn) {
		this.com = com ; // 지역변수 -> 전역변수에넣기
		this.model = model ; 
		this.inch = inch ; 
		this.val = val ; 
		this.ch = ch ; 
		this.turn = turn ; 
		
		/*if(this.turn = false) {
			this.turn2 = "껐다.";
		}else {
			this.turn2 = "켰다.";
		}
		this.turn = !this.turn;*/
	}
	
}
