package ch06;

public class ObjectEx {
	
	public ObjectEx() {
		String str1 = "Hello";
		String str2 = "Hello";
		
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		System.out.println(str1==str2);
		System.out.println(str3==str4);
		System.out.println(str1==str3);
		
		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str4));
		System.out.println(str1.equals(str3));
	}

	public static void main(String[] args) {
		new ObjectEx();
	}

}