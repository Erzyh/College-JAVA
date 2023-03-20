package ch02;

import java.util.Scanner;

public class IfPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요: ");
		int score = sc.nextInt();
		if (score >= 80) {
			System.out.println("축하합니다! 합격입니다.");
		}
		
		sc.close();
	}

}
