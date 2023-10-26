package obj04_Const;

public class Ch01_car {
	// 전역변수
	private String com;
	String model;
	String color;
	int speed ;
	
	
	Ch01_car(String com , String model , String color,int speed) {
		this.setCom(com) ; // 지역변수 -> 전역변수에넣기
		this.model = model ; 
		this.color = color ; 
		this.speed = speed ; 
	}


	public String getCom() {
		return com;
	}


	public void setCom(String com) {
		this.com = com;
	}
}
