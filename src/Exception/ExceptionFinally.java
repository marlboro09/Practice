package Exception;

public class ExceptionFinally {
	public static void main(String[] args) {
		System.out.println("ㅡㅡㅡㅡfinallyㅡㅡㅡㅡ");

		int x = 10;
		int y1 = 0;
		int y2 = 2;
		int z = 10;
		System.out.println("main: z = " + z);

		try {
			System.out.println("try before 'divide by 0'");
			z = x / y1;
			System.out.println("try after 'divide by 0'");
		} catch (ArithmeticException e) {
			System.out.println("catch(ArithmeticException) : " + e);
		} catch (Exception e) {
			System.out.println("catch(Exception) : " + e);
		} finally {
			System.out.println("finally : z = " + z);
		}
		System.out.println("main : z = " + z);
		System.out.println();
	}
}
/**
 * main z값이 먼저 출력
 * 숫자 값을 0으로 나누는 시도를 해서 catch(ArithmeticException)문장이 수행된다
 * finally문은 무조건 실행이 되서 z = 10이 실행
 * try - catch loop를 빠져나오고 z = 10이 수행
 */