package num6.innerclass;

/**
 * Outer클래스와 Inner클래스 선언
 */
class Outer {
	static int a = 10;
	int b = 20;
	void f(){
		System.out.println("안녕하세요");
	}
	class Inner {
		int c = 30;
		public void g() {
			b=100;
			f();
			System.out.println(a+" "+c);
		}
	}
}


public class InnerTest1 {
	public static void main(String[] args) {
		System.out.println("Outer에서 Inner 객체 선언하기");
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		in.g();	//Inner class의 g()메서드 호출하여 System.out.println(a+" "+c);실행
		System.out.println(out.b);
		System.out.println();
	}
}
