package obj08_singleton;

class Singleton{
	private static Singleton singleton = new Singleton();
	//생성자에 private를 붙여 객체를 생성 할 수 없게 , private가 붙으면 getter setter
	//싱글톤 : 전체 프로그램에서 단 하나의 객체만 만들도록 보장하는 기법
	//		 실행클래스에서 객체를 만들지 못하도록 해야 함 
	private Singleton() {} 
	
	//private static Singleton singleton2 ;
	
	//메소드 : 객체가 이미 생성됨
//	static Singleton getInstance() {
//		return singleton ;
//	}
	
	static Singleton getInstance() {
		return singleton ;
	}
	/////////////////////////////////////
	
	//인스턴스 멤버 => 객체가 생성되지 않으면 출력x 
	// 인스턴스멤버와 정적멤버 모두 사용 가능
	int num = 10;
	int plus(int x) {
		return num + x ;
	}
	
	//정적 멤버
	//인스턴스 멤버 사용 불가 : 이유는 객체가 만들어졌다는 보장이 없기 때문
	static int num2 = 30;
	static int plus() {
		return num2 + 10;
	}
	
}

public class Ch01_singleton {

	public static void main(String[] args) {
		//Singleton sg = new Singleton(); //불가
		Singleton sg = Singleton.getInstance();
		Singleton sg2 = Singleton.getInstance();
		
		if(sg == sg2) {
			System.out.println("같은 객체를 가리키고 있긔");
		}else {
			System.out.println("다른 객체를 가리키고 있긔");
		}
		
		Singleton single = new Singleton(); 
		Singleton single2 = new Singleton(); 
		
		if(single == single2) {
			System.out.println("같은 객체를 가리키고 있긔");
		}else {
			System.out.println("다른 객체를 가리키고 있긔");
		}
		
		/////////////////////////////////
		System.out.println(Singleton.num2);
		System.out.println(Singleton.plus());
	}

}
