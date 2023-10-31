package exam;

public class ab01_smartphone extends ab01_phone  {

	ab01_smartphone(String owner) {
		super(owner);
	}
	
	@Override
	public void turnOn() {
		System.out.println("전화를 받음");
	}
	@Override
	public void turnOff() {
		System.out.println("전화를 안받음");
	}
	
	void search(String search) {
		System.out.println("검색 : "+search);
	}
}
