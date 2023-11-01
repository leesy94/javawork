package ex01_Exception;

public class Ch09_Throws_printstacktrace_getmessage {

	public static void main(String[] args) {
		// throw 강제로 예외 발생 시키기
		// throws 
		/*try {
			//Exception e = new Exception("고의");
			//throw e;
			int num = 3/0 ;
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("예외 발생");
			//System.out.println(e);
		}*/
		try {
			change();
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println("no class");
		}
	}
	public static void change() throws ClassNotFoundException {
		//int num = Integer.parseInt(str);
		Class class01 = Class.forName("java.lang.String2");
	}

}
