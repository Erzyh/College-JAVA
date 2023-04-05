package java_report;

// Random import하기
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		// 7개 숫자를 저장할 배열 생성
		int[] lotto = new int[7];
		// Random 객체 생성
		Random r = new Random();
		
		// 반복 횟수 조절
		int cnt = 0;
		
		while(cnt < 7) {
			// 새로운 번호 추가
			int num = r.nextInt(45) + 1;
			// 중복 여부 확인 변수
			boolean isHave = false;
			
			// 중복이 있는지 확인하기
			for (int i = 0; i < 7; i++) {
				if(lotto[i] == num) {
					isHave = true;
					break;
				}
			}
			
			// 중복이 아니라면
			if (!isHave) {
				// 수를 배열에 저장하고, 카운트를 1 증가시킴
				lotto[cnt] = num;
				cnt++;
			}
		}
		
		// 7개의 숫자 출력
		System.out.print("[ ");
		for (int i = 0; i < 7; i++)
			System.out.print(lotto[i] + " ");
		System.out.print("]");
	}

}
