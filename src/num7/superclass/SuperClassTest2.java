package num7.superclass;

class Addresscard1 {
	String name;
	String handphone;
	String addrs;

	void cardprint() {
		System.out.println("이름 : " + name);
		System.out.println("핸드폰 : " + handphone);
		System.out.println("주소 : " + addrs);
	}
}

/**
 * 클래스 Addresscard1을 확장해 서브 클래스 Addresscard2를 생성
 */
class Addresscard2 extends Addresscard1 {
	double bonbong;
	double sudang;
	double wolgup;
	double Cal_wolgup() {
		wolgup = bonbong + sudang;
        return wolgup;
	}
	void play() {
		System.out.println("본봉 : " + bonbong);
		System.out.println("수당 : " + sudang);
	}
}

public class SuperClassTest2 {
	public static void main(String[] args) {
		System.out.println("---상속 기본 실습2---");
		Addresscard1 card1 = new Addresscard1();
		Addresscard2 card2 = new Addresscard2();
		double totalWorgup;

		card1.name = "홍길동";
		card1.handphone = "010-1234-5678";
		card1.addrs = "서울시 강남구 역삼동";
		card1.cardprint();
		card2.bonbong = 2000000;
		card2.sudang = 1000000;
		totalWorgup = card2.Cal_wolgup();

		System.out.println("최종 월급 : " + totalWorgup);
		card2.play();
		System.out.println();
	}
}
