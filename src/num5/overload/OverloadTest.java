package num5.overload;

public class OverloadTest {
    public static int max(int x, int y) {//int형 인수 2개를 받는 max 메서드
        if(x>y) {
            return x;
        } else {
            return y;
        }
    }

    public static double max(double x, double y) { //double형 인수 2개를 받는 max메서드
        if(x>y) {
            return x;
        } else {
            return y;
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(max(a, b));//int형 인수 2개를 받는 max메서드 호출

        double c = 10.5;
        double d = 20.5;
        System.out.println(max(c, d));//double형 인수 2개를 받는 max메서드 호출
    }
}
