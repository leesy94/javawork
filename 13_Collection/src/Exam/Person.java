package Exam;

public class Person {
	private String name;
	private int age;
	private String phone;
	private String address;

	/*public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAdress(String address) {
		this.address = address;
	}*/
	public void setPerson(String name,int age,String phone,String address) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getPhone() {
		return phone;
	}
	public String getAdress() {
		return address;
	}

	@Override
    public String toString() {
		return name+","+age+","+phone+","+address;
        
    }
}
