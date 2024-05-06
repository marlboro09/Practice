package num4.incdectest;

public class Main {
    public static void main(String[] args) {
        int x, y, z;

        x=10;
        y=5;
        z=0;

        z=x++ - y-- + 1;//++과 --가 변수 뒤에 붙어 있어 z=x-y+1이 먼저 실행 후 증감자 실행
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);

        x=10;
        y=5;
        z=0;

        z=++x - --y + 1;//++과 --가 앞에 붙어서 z=x-y+1이 나중에 실행
        System.out.println("x = " + x + ", y = " + y + ", z = "+ z);
    }
}
