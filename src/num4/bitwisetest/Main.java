package num4.bitwisetest;

public class Main {
    public static void main(String[] args) {
        int x;
        int y;

        x = 8;
        y = ~x;//보수 : 반전된 값을 구하는 단항 연산자
        System.out.println("x = "+ x +" ,y=" + y +"(~x)"  );

        System.out.println(x + "AND" + y + " = " + (x & y));

        System.out.println(x + "OR" + y + " = " + (x | y));

        System.out.println(x + "XOR" + y + " = " + (x ^ y));

        //2진수의 자리 이동
        x=x<<2;
        y=y<<2;
        System.out.println("x = " + x +" (x<<2), y=" + y +"(y<<2)");

        x=x>>2;
        y=y>>2;
        System.out.println("x = " + x + " (x>>2), y=" + y + "(y>>2)");

        x=y>>2;
        y=y>>>2;
        System.out.println("x = " + x + " (x>>2), y=" + y + "(y>>>2)");

    }
}
