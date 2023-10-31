package exam;

public abstract class ab01_phone {
	String owner;
	
	ab01_phone(String owner) {
		this.owner = owner;
	}
	
	abstract void turnOn();
	abstract void turnOff();

}
