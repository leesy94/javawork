package exam;

public class Ch02_Car {
	Ch02_Tire frontLeftTire = new Ch02_gumhoTire(); //형변환
	Ch02_Tire frontRightTire = new Ch02_koreaTire(); //형변환
	Ch02_Tire BackLeftTire = new Ch02_koreaTire(); //형변환
	Ch02_Tire BackRightTire = new Ch02_gumhoTire(); //형변환
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		BackLeftTire.roll();
		BackRightTire.roll();
	}
}
