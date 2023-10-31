package exam;

public class ab01_FolderPhone extends ab01_phone {

	ab01_FolderPhone(String owner) {
		super("폴더폰데스");
	}
	//@Override

	@Override
	void turnOn() {
		System.out.println("뚜껑을 열어서 전화를 받음");
	}

	@Override
	void turnOff() {
		System.out.println("뚜껑을 닫아서 전화를 안받음");
	}
	
	void message(String message) {
		System.out.println("메세지 : "+message);
	};

}
