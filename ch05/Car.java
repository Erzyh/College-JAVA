package ch05;

public class Car {
	String model;
	String no;
	String color;
	
	int velocity;
	
	public Car(String m, String n, String c) {
		model = m;
		no = n;
		color = c;
	}
	
	public String toString() {
		return "["+model+", "+no+", "+color+", "+velocity+"]";
	}
	
	void speedUp() {
		velocity++;
	}
}
