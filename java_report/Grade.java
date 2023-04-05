package java_report;

// Scanner 클래스를 위한 import
import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// 범위 별로 개수를 저장할 배열
		int[] cnt = new int[5];
		int num;
		
		// 숫자 입력받기
		System.out.print("숫자를 입력하세요: ");
		num = sc.nextInt();
		
		// 입력받은 숫자가 0이 아니라면 계속 반복하기
		while(num != 0) {
			// 받은 숫자의 범위에 따라 배열에 각각 저장하기
			if (num >= 1 && num <= 20)
				cnt[0]++;
			else if (num >= 21 && num <= 40)
				cnt[1]++;
			else if (num >= 41 && num <= 60)
				cnt[2]++;
			else if (num >= 61 && num <= 80)
				cnt[3]++;
			else if (num >= 81 && num <= 100)
				cnt[4]++;
			else if (num != 0)
				System.out.println("1에서 100 사이의 수를 입력하세요.");
			
			num = sc.nextInt();
		}
		
		// 범위 별로 출력하기
		for (int i = 0; i < 5; i++) {
			System.out.printf("%2d ~%3d 의 개수 : %d ", i * 20 + 1, i * 20 + 20, cnt[i]);
			
			// 개수에 따른 별 찍기
			for (int j = 0; j < cnt[i]; j++)
				System.out.print("*");
			System.out.println();
		}
		
		// Scanner 닫기
		sc.close();

	}

}
