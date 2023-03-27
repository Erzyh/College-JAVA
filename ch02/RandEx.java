package ch02;

import java.util.Random;

public class RandEx {

	public static void main(String[] args) {
		Random r = new Random();
		
		/*
		int num1 = r.nextInt()%6;
		int num2 = Math.abs(r.nextInt()%6);
		int num3 = r.nextInt(6);
		int num4 = r.nextInt(6)+1;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		*/
		
		/* For / If */
		int num, count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0;
		for(int i =0;i<120000;i++) {
			num = r.nextInt(6)+1;
			if(num==1)
				count1 += 1;
			if(num==2)
				count2 += 1;
			if(num==3)
				count3 += 1;
			if(num==4)
				count4 += 1;
			if(num==5)
				count5 += 1;
			if(num==6)
				count6 += 1;
			System.out.println(num);
		}
		System.out.println("Count 1 : " + count1);
		System.out.println("Count 2 : " + count2);
		System.out.println("Count 3 : " + count3);
		System.out.println("Count 4 : " + count4);
		System.out.println("Count 5 : " + count5);
		System.out.println("Count 6 : " + count6);
	}

}
