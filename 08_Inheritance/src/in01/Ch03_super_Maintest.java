package in01;

class Parent {
	int x = 10;
}
class Child extends Parent {
	int x = 20;
	
	void method() {
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x); //super 부모에서 가져옴
	}
}

public class Ch03_super_Maintest {

	public static void main(String[] args) {
		Child Child = new Child();
		Child.method();
	}

}
