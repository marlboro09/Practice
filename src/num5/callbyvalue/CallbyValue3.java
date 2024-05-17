package num5.callbyvalue;

public class CallbyValue3 {
	public static void swap(int x, int y) {
		int temp;
		temp = x;
		x=y;
		y=temp;

		System.out.println("교환 : x = " + x + ", y = " + y);
	}

	public static void main(String[] args) {
		System.out.println("CallbyValue연습");
		int x = 100;
		int y = 500;
		System.out.println("교환 전 : x = " + x + ", y = " + y);//교환 전 변수 내용 출력
		swap(x, y);	//메서드 호출
		System.out.println("교환 후 : x = " + x + ", y = " + y);//교환 후 변수 내용 출력
		System.out.println(	);
	}
}
