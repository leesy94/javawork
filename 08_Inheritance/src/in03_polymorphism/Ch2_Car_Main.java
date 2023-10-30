package in03_polymorphism;

public class Ch2_Car_Main {

	public static void main(String[] args) {
		//Ch2_Car car = null;
		//Ch2_FireCar fc = new Ch2_FireCar("모데루","레드"); // 값을 넣어줘야지만 됨 Ch2_FireCar에서 매개변수를 넣었기때문에
		//Ch2_FireCar fc2 = null;
		
		//fc.getPower();
		//System.out.println(fc.color);
		
		
		
		//다향성 : 호출은 같은 이름이지만 어떤 객체가 있느냐에 따라 값이 달라짐
		//자동형변환 : 자손타입 -> 부모타입으로 형변환
		//강제형변환 : 부모타입 -> 자손타입으로 형변환
		/*Ch2_FireCar fc3 = null;
		fc3 = (Ch2_FireCar)car;
		System.out.println(fc3.info());*/
		
		Ch2_FireCar fc = new Ch2_FireCar();
		Ch2_Car car = fc; //자동형변환
		fc = (Ch2_FireCar)car; //강제형변환
		
		Ch2_Car car2 = new Ch2_Car();
		Ch2_FireCar fc2 = (Ch2_FireCar)car2; // 형변환 불가
		
	}

}
