package java_report;

public class Over100 {

	public static void main(String[] args) {
		// 최초값과 카운트 횟수를 저장할 변수를 생성합니다.
		int num = 1, i;
		
		// 최초값이 1억 이하일 때까지 반복합니다.
		for(i = 1; num <= 100000000; i++) {
			// 최초값에 수를 곱합니다.
			num *= i;
		}
		
		// 확인을 위해 출력합니다.
		// i 변수의 값을 그대로 출력하면 곱한 수에 1이 증가해있기에 1을 차감해 출력합니다.
		System.out.println("최초로 1억을 넘는 정수는 " + num + "이며, 곱한 수는 " + (i-1) + "입니다.");

	}
}
