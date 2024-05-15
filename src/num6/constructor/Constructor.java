package num6.constructor;

/**
 * 생성자 클래스의 선언
 */
class Member {
	public long id;
	public String name;
	public int age;
	public Member manager;

	/**
	 * 인수 없는 생성자 메서드 선언
	 */
	Member() {
		id=0;
		name = "[No name]";
		age=20;
		manager = null;
		System.out.println(id + ',' + name + ',' + age);
	}

	/**
	 * 인수있는 생성자 메서드의 선언
	 */
	Member(long bunho, String irum, int nai, Member master){
		id = bunho;
        name = irum;
        age = nai;
        manager = master;
        System.out.println(id + ',' + name + ',' + age);
	}
}

/**
 * 객체의 선언
 * 인수있는 객체의 선언으로 메서드의 자동 실행
 */
public class Constructor {
	public static void main(String[] args) {
		System.out.println("생성자 실습");
		Member sun = new Member();
		Member park = new Member(1, "홍길동", 26, sun);
		System.out.println();
	}
}
