package num5.callbyvalue;

class ParaValue {
	void meth(int i, int j) {
		i *= 2;
		j /= 2;
	}
}

public class CallbyValue4 {
	public static void main(String[] args) {
		System.out.println("CallbyValue 연습4");
		ParaValue pv = new ParaValue();	//객체 선언
		int a = 15;
		int b = 20;
		System.out.println("a와 b의 이전 값 = " + a + " " + b);
		pv.meth(a, b);
		System.out.println("a와 b의 이후 값 = " + a + " " + b);
		System.out.println();
	}
}
