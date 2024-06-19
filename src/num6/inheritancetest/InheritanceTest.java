package num6.inheritancetest;

public class InheritanceTest {
	public static void main(String[] args) {
		Manager mng = new Manager("Test", 4000000, "sparta");
		//Manager 클래스의 객체를 생성하고 이름, 월급, 부서를 인수로 전달한다

		mng.getInformation(); //Manager 클래스의 getInformation메서드를 호출
	}
}
