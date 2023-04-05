package java_report;

// Scanner를 사용하기 위해 import합니다.
import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		
		// Scanner 객체를 생성합니다.
		Scanner sc = new Scanner(System.in);
		
		// 세 변에 해당하는 변수를 생성합니다.
		int a, b, c;
		
		// 세 변의 데이터값에 0이 입력되기 전까지 무한으로 반복합니다.
		while(true) {
			// 입력하라는 메시지를 출력합니다.
			System.out.print("3개 변의 길이를 입력하세요: ");
			
			// 세 변을 입력받습니다.
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			// 세 변의 수 중 0이 있는지 확인합니다. 있다면 종료합니다.
			if (a == 0 || b == 0 || c == 0) {
				System.out.println("종료합니다.");
				break;
			}
			
			// 삼각형이 맞는지 확인합니다.
			if (a + b > c && b + c > a && c + a > b) {
				// 정삼각형인지 확인합니다.
				if (a == b && b == c) {
					System.out.println("정삼각형입니다.");
				}
				// 직각삼각형인지 확인합니다.
				else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
					System.out.println("직각삼각형입니다.");
				// 정삼각형과 직각삼각형이 아니라면
				} else {
					System.out.println("삼각형입니다.");
				}
			} else {
				System.out.println("삼각형이 아닙니다.");
			}
		}
		// Scanner 객체를 닫습니다.
		sc.close();
	}
}
