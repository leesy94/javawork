package exam;

public class Ch04P_Member {
	private String name;
	private int age;
	private char gender ;
	
	Ch04P_Member() {}
	Ch04P_Member(String name , int age , char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "회원명 : "+name+" , 회원 나이 : " + age + " , 성별 : " + gender ;
	}
	
	/*public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name; 
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age; 
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getGender() {
		return gender; 
	}*/
	
	
}
