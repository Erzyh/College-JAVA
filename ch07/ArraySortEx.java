package ch07;

import java.util.Arrays;
import java.util.Random;

public class ArraySortEx {

	public ArraySortEx() {
		int[] num = new int[10];
		Random r = new Random();
		for (int i = 0; i < num.length; i++)
			num[i] = r.nextInt(45)+1;
		System.out.println(Arrays.toString(num));
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
	}
	
	public static void main(String[] args) {
		new ArraySortEx();
	}

}
