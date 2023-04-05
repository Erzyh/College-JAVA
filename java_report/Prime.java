package java_report;

public class Prime {

	public static void main(String[] args) {
		// 소수의 개수 / 합계 / 가장 큰 소수를 담을 변수를 생성합니다.
		int cnt = 0;
		int sum = 0;
		int max = 0;
		
		// 2부터 1만 까지 반복합니다.
		for (int i = 2; i <= 10000; i++) {
			
			// 소수의 판별을 위한 변수를 생성합니다.
			boolean isPrime = true;
			
			// 소수를 판별하기 위해 i를 j로 나눕니다.
			for (int j = 2; j * j <= i; j++) {
				// 만약 1과 자기 자신을 제외하고 나누어 떨어지는 수가 있는지 확인합니다. 그렇다면 종료합니다.
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			// 소수인 경우를 설정합니다.
			if (isPrime) {
				cnt++;
				sum += i;
				max = i;
			}
			
		}
		
		// 출력합니다.
		System.out.println("소수의 개수: " + cnt);
		System.out.println("소수의 합계: " + sum);
		System.out.println("가장 큰 소수: " + max);

	}

}
