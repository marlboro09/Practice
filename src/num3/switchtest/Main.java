package num3.switchtest;

public class Main {
    public static void main(String[] args) {
        int num = 2;

        switch(num) {
            case 1:
                System.out.println("결과는 1");
                break;
            case 2:
            case 3:
                System.out.println("결과는 2 또는 3");//case2에 break가 없기 때문에 3번이 출력 된다
                break;
            default:
                System.out.println("결과는 1,2,3이 아니다");//해당되는것이 없을 때 출력
                break;
        }
    }
}
