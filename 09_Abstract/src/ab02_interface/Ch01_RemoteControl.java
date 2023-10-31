package ab02_interface;

public interface Ch01_RemoteControl {
	//상수!!!
	public static final int MAX = 999;
	//public static String STR = "하이루"; //상수?
	int MIN_VOLUME = 0;
	
	void turnOn() ; //body 넣음 안됨
	void turnOff() ; //body 넣음 안됨
	// public abstract 붙이지 않으면 컴파일 시 자동으로 붙음
	void setVolume(int volume);
	
	//jdk 1.8버전부터 추가됨
	//default 메소드 : 실행문을 넣을 수 있다
	// 재정의 하지 않으면 아래 메소드 실행, 재정희하면 재정희한 메소드 호출
	default void setMute(int volume) {
		volume = 0;
		System.out.println("현재 볼륨 : "+volume);
	}
	
	//static 메소드 : 실행문을 넣울 스 있음
	static void info() {
		System.out.println("static 메소드 호출 가능");
	}
}
