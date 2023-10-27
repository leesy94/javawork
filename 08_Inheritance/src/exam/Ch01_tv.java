package exam;

public class Ch01_tv {
	String model = "ultra led tv" ;
	private boolean turn;
	private int channel;
	private int vol;

	public void turn() {
		turn = !turn;
		if(turn = true) {
			System.out.println("trun on");
		}else {
			System.out.println("trun off");
		}
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getChannel() {
		return channel;
	}
	public void setVol(int volum) {
		vol = volum;
	}
	public int getVol() {
		return vol;
	}
}
