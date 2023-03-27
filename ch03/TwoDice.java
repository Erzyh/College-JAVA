package ch03;

import java.util.Random;

public class TwoDice {
	
	public TwoDice() {
		Random r = new Random();
		
		int num1, num2, sum;
		
		int[] cnt = new int[21];
		
		for (int i =0; i < 120; i++) {
			
			num1 = r.nextInt(6)+1;
			num2 = r.nextInt(6)+1;
			
			sum=num1+num2;
			
			cnt[sum]++;
		}
		
		for(int i = 2; i < 13; i++) {
			System.out.printf("Count Of %2d : ", i);
			for(int j = 0; j < cnt[i]; j++)
				System.out.print("*");
			System.out.println(" " + cnt[i]);
		}
		
	}

	public static void main(String[] args) {
		new TwoDice();

	}

}
