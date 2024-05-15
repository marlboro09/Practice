package num6.staticinitialization;

/**
 * static 초기화 예제
 */

class one {
	static void one() {
		System.out.println("Init one");
	}
	public static void two() {
		System.out.println("one.two");
	}
}



class three {
	static void three() {
        System.out.println("Init three");
    }
	public static void two() {
		System.out.println("three.two");
	}
}

/**
 * one.two() -> one클래스의 two 메서드 호출
 * three.two() -> three클래스의 two 메서드 호출
 */
class StaticInitialization {
	public static void main(String[] args) {
		System.out.println("static initial");
		one.two();
		three.two();
		System.out.println("static initial");
	}
}
