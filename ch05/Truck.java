package ch05;

public class Truck extends Car{
	int ton;
	public Truck(String m, String n, String c, int t) {
		super(m, n, c);
		ton = t;
	}
	
	void speedUp() {
		velocity++;
		if(velocity > 120)
			velocity = 120;
	}
	
	public String toString() {
		return super.toString()+"["+ton+"]";
	}
}
