package java_report;

// Scanner 사용
import java.util.Scanner;

public class Obesity {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner sc = new Scanner (System.in);
		
		// 키와 몸무게 입력받기
		System.out.print("키를 입력하세요: ");
		int height = sc.nextInt();
		System.out.print("몸무게를 입력하세요: ");
		int weight = sc.nextInt();
		
		// 표준체중과 비만도 변수 생성
		double stWeight, obesity = 0;
		
		// 키가 150 이상인 경우
		if (height >= 150) {
			// 표준체중과 비만도 측정
			stWeight = (double)(height - 100) * 0.9;
			obesity = weight / stWeight * 100;
			
		// 키가 150 미만인 경우
		}else if (height < 150) {
			// 표준체중과 비만도 측정
			stWeight = height - 100;
			obesity = weight / stWeight * 100;
		}
		
		// 비만도에 따른 결과 출력
		if (obesity >= 90 && obesity <= 110) {
			System.out.printf("당신의 비만도는 %.1f%%이며 정상입니다.\n", obesity);
		}else if ((obesity >= 80 && obesity <= 89) || (obesity >= 111 && obesity <= 120)) {
			System.out.printf("당신의 비만도는 %.1f%%이며 주의입니다.\n", obesity);
		}else if ((obesity >= 0 && obesity <= 79) || (obesity >= 121)) {
			System.out.printf("당신의 비만도는 %.1f%%이며 노력 요함입니다.\n", obesity);
		}
		
		// Scanner 닫기
		sc.close();
	
	}

}
