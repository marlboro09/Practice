package num6.innerclass;

/**
 * OutClass 클래스의 객체 선언으로 생성자 수행
 */
class OutClass {
	int outerData = 1;
	MemberClass inc;

	OutClass() {
        inc = new MemberClass();	//Innter 클래스 객체 선언
		printData("내부 클래스에서 변경된 외부 클래스의 멤버 확인", outerData);
		printData("외부 클래스에서 내부 클래스의 멤버 참조", inc.innerData);
    }

	void printData(String var, int value) {
		System.out.println(var + " :" + value);
	}

	class MemberClass {
        int innerData = 2;

		/**
		 * Inner 클래스의 생성자 수행
		 */
		MemberClass() {
			printData("내부 클래스의 생정자에서 외부 클래스의 멤버 참조", innerData);
			outerData = 3;
		}
    }

	public static void main(String[] args) {
		System.out.println("Outer에서 Inner 변수 참조");
		new OutClass();
		System.out.println(	);
	}
}


