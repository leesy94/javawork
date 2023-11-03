package obj01;

public class Ch02_person {
	int id;
	Ch02_person(int id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object o) {
		/*Ch02_person p = (Ch02_person)o; //강제형변환
		int num = p.id;
		
		return id == num;*/
		if(o instanceof Ch02_person) {
			return id == ((Ch02_person)o).id;
		}else {
			return false;
		}
		
		
	}
}
