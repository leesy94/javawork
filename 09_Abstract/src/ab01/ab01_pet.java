package ab01;

public abstract class ab01_pet {
	private String kind;
	private String color;
	
	ab01_pet(String kind, String color) {
		this.kind = kind;
		this.color = color ;
	}
	
	//추상메소드 : 선언부만 있고 실행부분이 없는 메소드
	public abstract void sound();
	public abstract void pattern();
}
