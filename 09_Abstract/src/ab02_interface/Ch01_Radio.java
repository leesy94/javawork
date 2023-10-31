package ab02_interface;

public class Ch01_Radio implements Ch01_RemoteControl{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Radio를 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("Radio를 끕니다.");
	}

	@Override //언어테이션
	public void setVolume(int volume) {
		if(Ch01_RemoteControl.MAX > volume && Ch01_RemoteControl.MIN_VOLUME < volume) {
			this.volume = volume;
		}
		System.out.println("현재 Radio 볼륨 : " + this.volume);
	}

	@Override
	public void setMute(int volume) {
		System.out.println("Radio 무음모드");
	}
}
