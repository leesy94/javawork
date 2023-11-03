package obj01;

import java.util.Scanner;

public class Ch07_System {

	public static void main(String[] args) {
		long stime = System.currentTimeMillis();
		long snano = System.nanoTime();
		
		for(int i = 0 ; i < 1000 ; i++) {
			System.out.print(i);
		}
		
		long etime = System.currentTimeMillis();
		System.out.println("\n"+(etime - stime));
		
		Scanner scan = new Scanner(System.in);
		
	}

}
