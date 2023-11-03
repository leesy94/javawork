package obj01;

public class Ch03_HashCode_Main {

	public static void main(String[] args) {
		String str1 = new String("22");
		String str2 = new String("22");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode()); // 오버라이딩됨
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2)); //고유한 해쉬코드
	}

}
