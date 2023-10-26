package obj06_접근제한;

public class Ch02_snack {
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;

	/*void kind(String name) {
		this.name = name;
	}
	void name() {
		
	}*/
	Ch02_snack() {
		
	}
	Ch02_snack(String kind, String name, String flavor,int numOf,int price) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}
	
	/*void setKind(String kind, String name, String flavor,int numOf,int price) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}*/
	void setKind(String kind) {
		this.kind = kind;
	}
	void setName(String name) {
		this.name = name;
	}
	void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	void setNumof(int numOf) {
		this.numOf = numOf;
	}
	void setPrice(int price) {
		this.price = price;
	}
	public String getKind() {
		return kind;
	}
	public String getname() {
		return name;
	}
	public String getflavor() {
		return flavor;
	}
	public int getnumOf() {
		return numOf;
	}
	public int getprice() {
		return price;
	}
	public String info() {
		return kind + ", " + name + ", " + flavor + ", " + numOf + ", " + price;
	}

	
	


}
