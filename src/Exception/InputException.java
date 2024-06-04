package Exception;

public class InputException {
	public static void main(String[] args) {
		System.out.println("여러 예외처리를 지정한 경우");

		try {
			int num = Integer.parseInt(args[0]);
			System.out.println("입력된 숫자 :" + num);
		}
		catch (NumberFormatException e) {
			System.out.println("문자열을 정수로 변환이 불가능합니다.");
		}
		catch (Exception e) {
			System.out.println("인수가 입력되지 않았습니다.");
		}
		System.out.println();
	}
}
