package exam;

public class Ch01_normaltv extends Ch01_tv {
	String video ;
	
	public String setVideo(String tvnm) {  //인풋
		video = tvnm ;
		return video;
	}
	void getVideo() { //출력
		System.out.println(video);
	}
}
