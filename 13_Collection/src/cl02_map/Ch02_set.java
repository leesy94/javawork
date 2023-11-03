package cl02_map;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Member {
	private String name;
	private int age;
	private String phone;
	private String address;
	
	public Member() {}
	
	public Member(String name,int age,String phone,String address) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", phone=" + phone + ", address=" + address + "]";
	}

	@Override
	public int hashCode() {
		return name.hashCode()+age;
		//return Objects.hash(address, age, name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member mem = (Member)obj;
			return (mem.age == age) && (mem.name.equals(name));
		}
		return false;
		/*if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(address, other.address) && age == other.age && Objects.equals(name, other.name)
				&& Objects.equals(phone, other.phone);*/
	}
	
}

public class Ch02_set {

	public static void main(String[] args) {
		Member m = new Member("ddd",24,"wefewrw","werewrewrw");
		
		System.out.println(m.toString());
		
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("ddd",34,"",""));
		set.add(new Member("ddd",34,"asdasda","ffgf"));
		
		System.out.println(set.size());
	}

}
