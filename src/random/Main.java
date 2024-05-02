package random;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();

        System.out.println("0~99 범위의 난수 : " + Math.abs(r.nextInt()%100));
        //난수 값을 100으로 나눈 마너지를 양수로 바꿈
        //Random 클래스의 객체 r이 돌려주는값은 int형의 범위인데 이 수를 100으로 나눈 나머지는 -99~99 사이의 숫자 중 하나가 된다
        //abs() 메서드로 양수로 바꾸면 결과는 0~99사이 숫자 중 하나이다
    }
}
