package obj01;

public class Ch02_person_Main {

	public static void main(String[] args) {
		Ch02_person p = new Ch02_person(20231102);
		Ch02_person p2 = new Ch02_person(20231102);
		
		if(p.equals(p2)) {
			System.out.println(p+"와"+p2+"는 같다.");
		}else {
			System.out.println(p+"와"+p2+"는 다르다.");
		}
		
		if(p == p2) {
			System.out.println(p+"와"+p2+"는 같다.");
		}else {
			System.out.println(p+"와"+p2+"는 다르다.");
		}
	}

}
