package print02;

public class Ch02_printf_digit {

	public static void main(String[] args) {
		System.out.printf("%7d\n" , 32000);
		System.out.printf("%7d\n" , 143000);
		System.out.printf("%7d\n" , 5000);
		System.out.printf("%7d\n\n" , 6532000);
		
		System.out.printf("%07d\n" , 32000);
		System.out.printf("%07d%n" , 143000);
		System.out.printf("%07d\n" , 5000);
		System.out.printf("%07d\n\n" , 6532000);
		
		System.out.printf("%10s\n" , "abcdefu");
		System.out.printf("[%10s]\n" , "abcdefu");
		System.out.printf("[%-10s]\n\n" , "abcdefu");
		
		System.out.printf("%10.2f\n" , 3.14159);
		System.out.printf("%.3f\n" , 3.14159);
	}

}
