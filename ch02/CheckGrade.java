package ch02;

import java.util.Scanner;

public class CheckGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int score = sc.nextInt();
		int grade = sc.nextInt();
		
		sc.close();
		
		if (score >= 70)
			System.out.println("합격입니다.");
		else if (score >=60 && grade != 4)
			System.out.println("합격입니다.");
		else
			System.out.println("불합격입니다.");
	}

}
