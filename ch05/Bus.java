package ch05;

public class Bus extends Car {
	int capacity;
	public Bus(String m, String n, String c, int capacity) {
		super(m, n, c);
		this.capacity = capacity;
	}
	
	void speedUp() {
		velocity++;
		if(velocity > 150)
			velocity = 150;
	}
	
	public String toString() {
		return super.toString()+"["+capacity+"]";
	}
}
