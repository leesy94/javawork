package ex01_Exception;
class Animal {
	
}
class Dog extends Animal {
	
}
class Cat extends Animal {
	
}
public class cH05_ClassCastException {

	public static void main(String[] args) {
		try {
			Dog dog = new Dog();
			Animal ani = dog; //dog를 animal로 형변환
			Dog dog2 = (Dog)ani; //가능
			System.out.println("dog 형변환");
			
			Animal ani2 = new Animal();
			Cat cat = (Cat)ani2; //animal을 cat으로 형변환 => 오류
			System.out.println("cat 형변환");
		}catch(ClassCastException ce) {
			System.out.println("ClassCastException");
		}
		
		
		cH05_ClassCastException.change(new Animal());
		cH05_ClassCastException.change(new Dog());
				
	}

	public static void change(Animal ani) {
		if(ani instanceof Dog) {
			Dog dog = (Dog)ani;
			System.out.println("Dog클래스로 형변환");
		}else if(ani instanceof Cat) {
			Cat cat = (Cat)ani;
			System.out.println("Cat클래스로 형변환");
		}else {
			System.out.println("클래스 형변환 불가");
		}
	}
}

