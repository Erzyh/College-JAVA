package ch04;

class Car{
	String model;
	String no;
	String color;
	
	Car(String name, String no, String color){
		model = name;
		this.no = no;
		this.color = color;
		velocity=10;
	}
	
	int velocity;
	void speedUp() {
		velocity++;
	}
	void speedDown() {
		velocity--;
	}
	
	public String toString() {
		String str = "["+model+","+no+","+color+","+velocity+"]";
		return str;
	}
}

class Truck extends Car{
	Truck(String name, String no, String color, int ton) {
		super(name, no, color);
		this.ton=ton;
	}

	int ton;
}

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car("SONATA", "123라 4567", "RED");
		for(int i=0; i < 50; i++) myCar.speedUp();
		System.out.println(myCar);
		
		Car yourCar = new Car("Morning", "888라 8888", "WHITE");
		System.out.println(yourCar);
		
		Car hisCar = new Car("QM6", "333나 3333", "BLUE");
		System.out.println(hisCar);
		
		Truck herTruck = new Truck("TITAN", "222수 3333", "BLACK", 8);
		System.out.println(herTruck);
		
	}

}
