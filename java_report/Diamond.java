package java_report;

// Scanner 사용
import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner sc = new Scanner(System.in);

		int num;
		
		// 무한 반복 (0이 입력될 때까지)
		while (true) {
			
			// 숫자 입력받기
			System.out.print("숫자를 입력하세요! (1~20, 0: exit): ");
			
			if (sc.hasNextInt()) {
				num = sc.nextInt();
				
				if (num == 0) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				
				// 범위를 벗어날 경우에 메시지를 출력하고 다시 입력 받습니다.
				else if (num < 1 || num > 20) {
					System.out.println("범위를 벗어났습니다. 1~20 사이의 숫자를 입력하세요.");
					continue;
				}
				
				else {
					// 중간점 설정
                    int mid = (num + 1) / 2;

                    // 다이아몬드의 '상단'을 출력합니다.
                    // 중간점을 기준으로 위쪽 다이아몬드 출력
                    for (int i = 1; i <= mid; i++) {
                        // 공백을 만듦
                        for (int j = 1; j <= mid-i; j++) {
                            System.out.print(" ");
                        }
                        // 별을 생성함
                        for (int k = 1; k <= 2*i-1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                    // 다이아몬드의 '하단'을 출력합니다.
                    // 중간점을 기준으로 아래쪽 다이아몬드 출력
                    for (int i = mid-1; i >= 1; i--) {
                        // 공백 출력
                        for (int j = 1; j <= mid-i; j++) {
                            System.out.print(" ");
                        }
                        // 별 생성하기
                        for (int k = 1; k <= 2*i-1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
					
				}
			}else {
				// 만약 문자가 입력되었다면
				String text = sc.next();
                System.out.println("문자는 입력할 수 없습니다.");
			}
		}
		
		// Scanner 닫기
		sc.close();
	}
}