package Exception;

/**
 * 숫자 값을 0으로 나누면 Divide by Zero 에러가 발생
 * catch문에서 산술처리 예외가 발생하고 프로그램이 멈춤
 */
public class ExceptionCatch1 {
	public static void main(String[] args) {
		System.out.println("ㅡㅡㅡㅡ산술 예외처리를 지정한 경우ㅡㅡㅡㅡ");
		int bunmo;
		int result;

		try {
			bunmo = 0;
			result = 100 / bunmo;
		}
		catch (ArithmeticException e) {
			System.out.println("에러 -> 분자의 수가 0으로 나누어짐");
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		System.out.println();
	}
}
