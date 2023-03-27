package ch02;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		/* INT 입력
		System.out.print("Input Number1: ");
		int num1 = in.nextInt();
		System.out.print("Input Number2: ");
		int num2 = in.nextInt();
		
		in.close();
		
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		System.out.println(num1+"-"+num2+"="+(num1-num2));
		System.out.println(num1+"*"+num2+"="+(num1*num2));
		System.out.println(num1+"/"+num2+"="+(num1/(double)num2));
		System.out.println(num1+"%"+num2+"="+(num1%num2));
		*/
		
		/* DOUBLE 입력
		System.out.print("Input Number1: ");
		double num1 = in.nextDouble();
		System.out.print("Input Number2: ");
		double num2 = in.nextDouble();
		
		in.close();
		
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		System.out.println(num1+"-"+num2+"="+(num1-num2));
		System.out.println(num1+"*"+num2+"="+(num1*num2));
		System.out.println(num1+"/"+num2+"="+(num1/num2));
		System.out.println(num1+"%"+num2+"="+(num1%num2));
		*/
		
		/* STRING 입력 */
		String name2 = in.nextLine();
		
		System.out.print("Input Number1: ");
		int num1 = in.nextInt();
		System.out.print("Input Number2: ");
		int num2 = in.nextInt();
		
		// String name = in.next();
		
		
		in.close();
		
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		System.out.println(num1+"-"+num2+"="+(num1-num2));
		System.out.println(num1+"*"+num2+"="+(num1*num2));
		System.out.println(num1+"/"+num2+"="+(num1/(double)num2));
		System.out.println(num1+"%"+num2+"="+(num1%num2));
		//System.out.println(name);
		System.out.println(name2);
	}

}
