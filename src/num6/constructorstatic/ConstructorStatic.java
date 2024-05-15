package num6.constructorstatic;

class Sell {    //클래스 필드
	private String name;
	private int quantity;
	private int price;    //정적필드
	//생성자 메서드
	public Sell(String nm, int qt, int pr) {
		name = nm;
		quantity = qt;
		price = pr;
	}
	//클래스 필드 표시
	void Mark() {
		System.out.println(name + '\t' + quantity + '\t' + price);
	}
	//정적 메서드
	public static void Title() {
		System.out.println("품명\t수량\t단가");
	}
}

public class ConstructorStatic {
	public static void main(String[] args) {
		System.out.println("생성자와 static 메서드 실습");
		System.out.println("-----------------------");
		//객체 선언
		Sell s1 = new Sell("사과", 10, 1000);
		Sell s2 = new Sell("배", 20, 2000);
		Sell s3 = new Sell("딸기", 30, 3000);

		//클래스 메서드 호출
		Sell.Title();

		//메서드 호출
		s1.Mark();	//Sell1에 대해 Mark()를 실행
		s2.Mark();
		s3.Mark();
		System.out.println();
	}
}
