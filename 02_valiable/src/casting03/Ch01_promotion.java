package casting03;

public class Ch01_promotion {

	public static void main(String[] args) {
		//byte(1) < short(2) = char(2) < int(4) < long(8) < float(4,실수형이라서 더 큼) < double(8)
		byte b1 = 20;
		int int1 = b1 ;
		System.out.println(int1);

		double d1 = int1;
		System.out.println(d1);
		
		char ch1 = 'A';
		int int2 = ch1;
		System.out.println(int2);
		
		char ch2 = '#';
		int int3 = ch2;
		System.out.println(int3);		
	}

}
