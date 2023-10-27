package in01;

class Parent2 {
	int x = 10;
	void display() {
		System.out.println("부모클래스의 display() 메소드");
	}
}
class Child2 extends Parent2 {
	int x = 20;
	
	void display() {
		System.out.println("자식클래스의 display() 메소드");
	}
	
	void method() {
		display();
		super.display();
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x); //super 부모에서 가져옴
	}
}

public class Ch03_super_Maintest2 {

	public static void main(String[] args) {
		Child2 Child = new Child2();
		Child.method();
	}

}
