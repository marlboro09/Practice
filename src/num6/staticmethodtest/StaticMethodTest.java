package num6.staticmethodtest;

import num6.statictest.StaticTest;

public class StaticMethodTest {
	int width;
	int height;
	int depth;
	long idNum;
	static long boxId = 100;

	/**
	 * 클래스 메서드는 클래스 변수만 사용한다
	 * @return
	 */
	static long getcurrentID() {
		return boxId++;
	}
}

class StaticVariableMethod {
	public static void main(String[] args) {
		System.out.println("static변수와 메서드 실습");

		//클래스 명을 통해 클래스 메서드 사용
		StaticMethodTest mybox1 = new StaticMethodTest();
		mybox1.idNum =StaticMethodTest.getcurrentID();

		//객체명을 통해서 클래스 메서드 사용
		StaticMethodTest mybox2 = new StaticMethodTest();
		mybox2.idNum =StaticMethodTest.getcurrentID();

		System.out.println("mybox1의 id : " + mybox1.idNum);
		System.out.println("mybox2의 id : " + mybox2.idNum);
		System.out.println("다음 박스의 id : " + StaticMethodTest.boxId);
		System.out.println();

	}
}
