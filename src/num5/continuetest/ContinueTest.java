package num5.continuetest;

public class ContinueTest {
    public static void main(String[] args) {
        int i = 0;

        while (i < 10) {
            i++;
            if (i % 2 == 0) {   //짝수인 경우에는 이동
                continue;
            }
            System.out.println(i);
        }
    }
}
