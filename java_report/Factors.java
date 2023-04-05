package java_report;

// Scanner 클래스를 사용하기 위해 import합니다.
import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// Scanner 객체를 생성합니다.
		Scanner sc = new Scanner(System.in);
		
		// 숫자를 입력 받고 변수에 저장합니다.
		int num = sc.nextInt();
		
		// 1부터 num까지 모든 수에 대해 약수인지 확인합니다.
		for (int i = 1; i <= num; i++) {
			// num을 i로 나누어서 나머지가 0인 경우를 찾습니다.
			// 0이라면 i는 num의 약수입니다.
			if (num % i == 0)
				// 약수를 출력합니다.
				System.out.println(i);
		}
		
		// Scanner 객체를 닫습니다.
		sc.close();
	}
}
