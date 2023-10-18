package var01;

public class Ch05_String {

	public static void main(String[] args) {
		String str1 = "불꽃카리스마민호우";
		String str2 = "불꽃카리스마민호우우우우";
		
		System.out.println(str1);
		
		// escape sequence(이스케이프 문자)
		/*
			\ + 문자 => 특수 기능
			
			\n = 줄바꿈
			\t = tab 만큼 띄우기
			\" = " 출력
			\\ = \ 출력		
		*/
		
		System.out.println("월울\n야옹야옹"); //alert 이랑 비슷
		System.out.println("월울\t야옹야옹"); 
		System.out.println("월울\"야옹야옹\"");
	}

}
