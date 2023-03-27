package ch03;

import java.util.Scanner;

public class KeyInputEx {

	public KeyInputEx() {
		Scanner sc = new Scanner(System.in);
		
		int num, count = 0, sum = 0;
		num = sc.nextInt();
		while(num >= 1) {
			count++;
			sum+=num;
			/*for(int i =1; i < 10; i++) {
				System.out.println(num + " * "+ i + " = " + num * i);
			}*/
			num = sc.nextInt();
		}
		
		System.out.println("Count: " + count + " Sum: " + sum);
		
		sc.close();
	}
	public static void main(String[] args) {
		new KeyInputEx();

	}

}
