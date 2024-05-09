package num5.callbyreference;

public class CallbyReferenceTest {
    public static void swap(Number z) {
        int temp = z.x;
        z.x = z.y;
        z.y = temp;
    }

    public static void main(String[] args) {
        Number n = new Number();
        n.x = 10;
        n.y = 20;

        System.out.println("메서드 호출 전 : " + n.x + "," + n.y);
        swap(n);
        System.out.println("메서드 호출 후 : " + n.x + "," + n.y);
    }
    //main메서드에서 Number 클래스의 객체인 n을 만들어 인수로 전달해 swap 메서드 내에서 Number 클래스 내의 x와 y값을 바꾼 결과가 출력
}

class Number {
    int x;
    int y;
}
