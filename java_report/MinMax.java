package java_report;

// Random 클래스를 사용하기 위해 import합니다.
import java.util.Random;

public class MinMax {

	public static void main(String[] args) {
		// Random 클래스의 인스턴스를 생성합니다.
		Random r = new Random();
		
		// 정수형인 num1과 num2에 각각 1부터 100 사이의 임의의 수를 부여합니다.
		int num1 = r.nextInt(100) + 1;
		int num2 = r.nextInt(100) + 1;
		
		// 작은 값과 큰 값을 대입할 변수를 정수형으로 생성합니다.
		int min, max;

		// 두 숫자 중 작은 값은 min 변수에, 큰 값은 max 변수에 저장합니다.
		if (num1 < num2) {
			min = num1; max = num2;
		}else {
			min = num2; max = num1;
		}
		
		// 정확하게 실행되었는지를 확인하기 위해 출력합니다.
		System.out.println("num1의 값은 " + num1 + ", num2의 값은 " + num2);
		System.out.println("min의 값은 " + min + ", max의 값은 " + max);
	}
}
