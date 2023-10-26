package obj04_Const;

public class Ch03_overloading {
	// 전역변수
	String com;
	String model;
	String color;
	int speed ;
	
	
	Ch03_overloading(String com , String model , String color,int speed) {
		this.com = com ; // 지역변수 -> 전역변수에넣기
		this.model = model ; 
		this.color = color ; 
		this.speed = speed ; 
	}
	Ch03_overloading () {
		
	}
	Ch03_overloading (String com) {
		this.com = com ;
	}
}
