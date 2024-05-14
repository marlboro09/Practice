package num6.statictest;

import java.sql.SQLOutput;

public class StaticTest {
	protected int v1;
	protected int w2;
	protected String N1;

	//정적 변수 선언
	static String stamade;

	public static void main(String[] args) {
		StaticTest mysta, yoursta;
		System.out.println("static 실습");
		//클래스 객체를 생성한 뒤 정적 변수에 값을 할당
		mysta = new StaticTest();
		mysta.stamade = "홍길동";

		//클래스 객체를 새롭게 생성
		yoursta = new StaticTest();

		//클래스 객체간에 정적 변수가 공유되는지 확인
		System.out.println("yoursta 클래스 객체의 변수는 :" + yoursta.stamade);

		//클래스 차원에서 정적 변수의 접근이 가능함을 확인
		System.out.println("stajava 클래스 객체의 변수는 :" + StaticTest.stamade);
		System.out.println();
	}
}
