package ch03;

import java.util.Scanner;

public class StarEx {
	
	public StarEx() {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		while (num > 0) {
			if (num <= 20) {
				drawTr(num);
			}else {
				System.out.println("Please enter under 21");
			}
			num = sc.nextInt();
		}
		
		num = sc.nextInt();
		
		sc.close();
	}
	
	void drawTr(int scale) {
		for(int i = 0; i < scale; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new StarEx();

	}

}
