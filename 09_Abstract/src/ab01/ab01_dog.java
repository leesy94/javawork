package ab01;

public class ab01_dog extends ab01_pet{

	ab01_dog(String kind, String color) {
		super("강아지", color);
	
	}

	@Override
	public void sound() {
		System.out.println("멍멍");
	}

	@Override
	public void pattern() {
		System.out.println("얼룩덜룩");
	}
	
}
