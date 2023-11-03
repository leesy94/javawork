package obj01;

class value{
	int value;
	value(int val) {
		value = val;
	}

	@Override
	public boolean equals(Object o) {
		value vv = (value)o; //강제형변환
		int num = vv.value;
		
		return value == num;
	}
}
public class Ch01_Equlas01 {

	public static void main(String[] args) {
		value v = new value(10);
		value v2 = new value(10);
		
		if(v.equals(v2)) {
			System.out.println("address same");
		}else {
			System.out.println("address different");
		}
		
		if(v == v2) {
			System.out.println("address same");
		}else {
			System.out.println("address different");
		}
		
		v = v2; //주소가 같아짐
		
		if(v.equals(v2)) {
			System.out.println("address same");
		}else {
			System.out.println("address different");
		}
	}

}
