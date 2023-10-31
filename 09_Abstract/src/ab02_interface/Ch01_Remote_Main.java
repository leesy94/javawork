package ab02_interface;

public interface Ch01_Remote_Main {

	public static void main(String[] args) {
		Ch01_RemoteControl rc = null;
		rc = new Ch01_Tv();
		//rc = new Audio();
		//Ch01_Tv rcTv = new Ch01_Tv();
		rc.turnOn();
		rc.setVolume(150);
		
		rc.turnOff();
		rc.setVolume(100);
		
		Ch01_RemoteControl rc2 = new Ch01_RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("익명객체이서 라디오킴");
			}

			@Override
			public void turnOff() {
				System.out.println("익명객체이서 라디오끔");
			}

			@Override
			public void setVolume(int volume) {
				System.out.println("익명 객체 볼륨 : "+volume);
			}
			
		};
		
		rc2.turnOff();
		rc2.turnOn();
		rc2.setVolume(30);
		rc2.setMute(0);
		
		
		rc = new Ch01_Radio();
		rc.setMute(0);
		
	}

}
