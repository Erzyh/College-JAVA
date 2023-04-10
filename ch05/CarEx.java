package ch05;

public class CarEx {

	public CarEx() {
		Truck[] t = new Truck[2];
		t[0] = new Truck("TITAN", "33다 3333", "WHITE", 5);
		t[1] = new Truck("POWER", "77리 7654", "GRAY", 8);
		for(int i = 0; i < 100; i++) t[0].speedUp();
		for(int i = 0; i < 200; i++) t[1].speedUp();
		System.out.println(t[0]);
		System.out.println(t[1]);
		
		Bus[] b = new Bus[2];
		b[0] = new Bus("DAEWOO V5", "33다 5566", "GREEN", 35);
		b[1] = new Bus("FILLO", "55라 7193", "BLACK", 45);
		for(int i = 0; i < 100; i++) b[0].speedUp();
		for(int i = 0; i < 200; i++) b[1].speedUp();
		System.out.println(b[0]);
		System.out.println(b[1]);
	}
	
	public static void main(String[] args) {
		new CarEx();
	}

}
