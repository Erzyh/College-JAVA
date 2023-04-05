package java_report;

public class Dividend {

	public static void main(String[] args) {
		// 투자금과 배율을 변수로 저장합니다.
		int balance = 1000000;
		double d = 1.43;
		
		// 100만원부터 1천만원 까지 100만원 단위로 반복합니다.
		for (int i = 1; i <= 10; i++) {
			// 배당금을 출력합니다.
			System.out.println(balance * d + "원");
			// 투자금에 100만을 추가합니다.
			balance += 1000000;
		}
	}

}
