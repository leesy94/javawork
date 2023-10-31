package ab02_interface;

public class Ch01_Tv implements Ch01_RemoteControl{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("tv를 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("tv를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(Ch01_RemoteControl.MAX > volume && Ch01_RemoteControl.MIN_VOLUME < volume) {
			this.volume = volume;
		}
		System.out.println("현재볼륨 : " + this.volume);
	}

	
}
