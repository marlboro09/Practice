package num5.callbyreference;

class Swap{
	public int x, y;
	public static void swap(Swap ob) {
		int temp = ob.x;
        ob.x = ob.y;
        ob.y = temp;

		System.out.println("교환 : x = "+ ob.x+", y = "+ ob.y);
	}
}
public class CallbyReference2 {
	public static void main(String[] args) {
		System.out.println("CallbyReference 연습2");
		Swap xy = new Swap();
		xy.x = 100;
		xy.y = 500;
		System.out.println("교환 전 : x = "+ xy.x+", y = "+xy.y);
		Swap.swap(xy);
		System.out.println("교환 후 : x = "+ xy.x + ", y = " + xy.y);
		System.out.println();
	}
}
