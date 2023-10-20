package conditional01;

public class Ch03_for {

	public static void main(String[] args) {
		for(int i = 2 ; i <= 9 ; i++) {
			if(i % 3 == 0) {
				//System.out.println(i);
			}
			System.out.println("<"+i + "단>");
			for(int j = 1 ; j <= 9 ; j++ ) {
				System.out.println(i+"x"+j+"="+(i*j));
			}
			System.out.println( );
			
		}
		
		
		
	}

}
