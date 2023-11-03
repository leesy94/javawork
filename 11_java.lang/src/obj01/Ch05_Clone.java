package obj01;

class Point implements Cloneable{
	int x;
	int y;
	
	Point(int x , int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "x = " + x + " , y = " + y ;
	}
	
	public Object clone() {
		Object obj = null;
		
		obj = clone();
		
		return obj;
	}
}

public class Ch05_Clone {

	public static void main(String[] args) {
		Point p = new Point(3,7);
		Point copy = (Point)p.clone();
		
		System.out.println(p);
		System.out.println(copy);
		
		System.out.println(p.hashCode());
		System.out.println(copy.hashCode());
		
		int[] arr = {1,2,3,4,5};
		int[] copyArr = arr;
		int[] arrClone = arr.clone();
		
		System.out.println(arrClone[0]);
		
		arrClone[0] = 9 ;
		System.out.println(arrClone[0]);
		System.out.println(arr[0]);
		
	}

}
