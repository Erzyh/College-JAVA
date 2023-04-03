package ch04;

public class Triangle {
	
	/*
	int width;
	int height;
	
	Triangle(int w, int h){
		width = w;
		height = h;
	}
	
	int getArea() {
		return width*height/2;
	}

	public static void main(String[] args) {
		Triangle tr = new Triangle(4, 6);
		System.out.println(tr.getArea());
	}
	*/
	
	int n1, n2, n3;
	
	Triangle(int n1, int n2, int n3){
		this.n1=n1;
		this.n2=n2;
		this.n3=n3;
	}
	
	boolean isTriangle() {
		boolean isTriangle = true;
		if(n1+n2 < n3 || n1+n3 < n2 || n2+n3 < n1)
			isTriangle = false;
		return isTriangle;
	}
	
	boolean isEqualTriangle() {
		boolean isEqualTriangle = false;
		if(n1 == n2 && n2 == n3)
			isEqualTriangle = true;
		return isEqualTriangle;
	}
	
	boolean isRightTriangle() {
		boolean isRightTriangle = false;
		if(n1*n1 + n2*n2 == n3*n3 || n1*n1 + n3*n3 == n2*n2 || n2*n2 + n3*n3 == n1*n1)
			isRightTriangle = true;
		return isRightTriangle;
	}
	
	public static void main(String[] args) {
		Triangle t = new Triangle(3, 4, 5);
		if(t.isTriangle())
			System.out.println("삼각형입니다.");
			if(t.isEqualTriangle())
				System.out.println("정삼각형입니다.");
			if(t.isRightTriangle())
				System.out.println("직각 삼각형입니다.");
		else
			System.out.println("삼각형이 아닙니다.");
	}
}
