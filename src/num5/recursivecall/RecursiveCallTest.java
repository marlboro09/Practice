package num5.recursivecall;

public class RecursiveCallTest {

//    int power(int x, int y) {
//        if(x<=0) {
//            return 1;
//        } else {
//            return x * power(x, y-1);//x를 y번 곱함
//        }
//    }
// x의 y승을 구하는 메서드인데 y가 아닌 x값과 0을 비교해 무한루프에 빠지게 된다

    public static int power(int x, int y) {
        if(y<=0) {
            return 1;
        } else {
            return x * power(x, y-1);//x를 y번 곱함
        }
    }

    public static void main(String[] args) {
        System.out.println("power(2,1) : " + power(2, 1));
        System.out.println("power(2,2) : " + power(2, 2));
        System.out.println("power(2,3) : " + power(2, 3));
        System.out.println("power(2,4) : " + power(2, 4));
        System.out.println("power(2,5) : " + power(2, 5));
    }

}
