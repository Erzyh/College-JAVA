package ch02;

public class ForPractice {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i<= 100; i++ ) {
			if(i%3 == 0 || i%5 == 0) {
				System.out.print(i+" ");
				sum+=i;
			}
		}
		System.out.println("\n합계는 "+sum);
	}

}
