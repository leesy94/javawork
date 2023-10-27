package exam;

public class Ch01_tv_maintest {

	public static void main(String[] args) {
		Ch01_aitv ai = new Ch01_aitv();
		ai.turn();
		ai.setChannel(11);
		
		System.out.println(ai.genre("로맨스"));
		//System.out.println(ai.model);
		
		Ch01_normaltv nt = new Ch01_normaltv();
		
		System.out.println(nt.model);
		
		nt.setVideo("마이 빼이 보릿 비디오");
		nt.getVideo();
		//System.out.println(nt.video);
	}

}
