package num6.constructortest;

public class ConstructorTest {
	public static void main(String[] args) {
		Clock c = new Clock(10, 55, 16); // 10시 55분 16초를 인수로 전달
		c.printTime();	// Clock 클래스의 prinTime() 메서드 호출
	}
}

class Clock {

    int hour;
    int minute;
    int sec;

    public Clock(int h, int m, int s) {	//생성될 때 h, m, s를 인수로 받음
        hour = h;
        minute = m;
        sec = s;
    }

    public void printTime() {	//Clock 클래스의 멤버변수 hour, min, sec출력
        System.out.println(hour + ":" + minute + ":" + sec);
    }

}

