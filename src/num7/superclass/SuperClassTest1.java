package num7.superclass;

/**
 * 부모 클래스 선언
 */
public class SuperClassTest1 {
	int x, y;

	/**
	 * 생성자
	 */
	public SuperClassTest1(int a, int b) {
        this.x = a;
        this.y = b;
    }

	public int sum() {	// 메서드
		return (x + y);	// 결과값이 반환된다
	}
}

class SubClass extends SuperClassTest1 {
	public SubClass() {	//생성자
		super(30, 20); //상위 클래스 생성자 호출
	}

	public int sub() {	//메서드
		return (x - y);	//결과 값이 반환된다
	}
}

class InheritanceEx1 {
	public static void main(String[] args) {
		System.out.println("---상속의 기본 실습---");
		SubClass IheritanceTest = new SubClass();
		System.out.println("sum() = " + IheritanceTest.sum());
		System.out.println("sub() = " + IheritanceTest.sub());
		System.out.println();
	}
}