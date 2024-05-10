package num5.fortest;

public class ForTest {
    public static void main(String[] args) {
        for(int i=10; i>0; i--) {   // i값이 10부터 0까지 감소
            for(int j=0; j<i; j++) {//j 값은 0부터 i까지 1씩 증가
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
