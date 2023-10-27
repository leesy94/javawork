package obj07_args;

class Document{
	static int count ;
	String name;
	Document() {
		this("제목없음"+ ++count);
	}
	Document(String name) {
		this.name = name;
		System.out.println("문서"+ name);
	}
}
class product {
	static int c;
	int sn;
	
	product() {
		++c;
		sn = c;
	}
}


public class Ch01_exDocument_MainTest {

	public static void main(String[] args) {
		Document d = new Document();
		Document d1 = new Document(" 책데스");
		Document d2 = new Document();
		Document d3 = new Document();
		
		product p1 = new product();
		product p2 = new product();
		product p3 = new product();
		product p4 = new product();
		
		System.out.println("p1 제품번호 = " + p1.sn);
		System.out.println("p2 제품번호 = " + p2.sn);
		System.out.println("p3 제품번호 = " + p3.sn);
		System.out.println("p4 제품번호 = " + p4.sn);
		System.out.println("생산된 총 제품 수 : " + product.c);
		
	}

}
