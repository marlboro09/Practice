import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> results = new ArrayList<>();

		while (true) {
			System.out.print("첫 번째 숫자를 입력하세요: ");
			int num1 = 0;
			if (sc.hasNextInt()) {
				num1 = sc.nextInt();
			} else {
				System.out.println("유효한 숫자를 입력하세요.");
				sc.next(); // 잘못된 입력을 소비하고 건너뜀
				continue;
			}

			System.out.print("두 번째 숫자를 입력하세요: ");
			int num2 = 0;
			if (sc.hasNextInt()) {
				num2 = sc.nextInt();
			} else {
				System.out.println("유효한 숫자를 입력하세요.");
				sc.next(); // 잘못된 입력을 소비하고 건너뜀
				continue;
			}

			System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");
			char operator = sc.next().charAt(0);

			int result = 0;

			switch (operator) {
				case '+':
					result = num1 + num2;
					break;
				case '-':
					result = num1 - num2;
					break;
				case '*':
					result = num1 * num2;
					break;
				case '/':
					if (num2 == 0) {
						System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
						continue;
					}
					result = num1 / num2;
					break;
				default:
					System.out.println("올바른 연산 기호를 입력하세요.");
					continue;
			}

			System.out.println("결과: " + result);

			// 결과를 컬렉션에 저장
			results.add(result);

			System.out.println("더 계산하시겠습니까? (exit 입력 시 종료, remove 입력 시 삭제, inquiry 입력 시 조회)");
			String input = sc.next();
			if (input.equals("exit")) {
				break;
			} else if (input.equals("remove")) {
				if (!results.isEmpty()) {
					results.remove(0);
				} else {
					System.out.println("저장된 결과가 없습니다.");
				}
			} else if (input.equals("inquiry")) {
				if (results.isEmpty()) {
					System.out.println("저장된 연산 결과가 없습니다.");
				} else {
					for (int res : results) {
						System.out.println(res);
					}
				}
			}
		}

		sc.close();
	}
}
