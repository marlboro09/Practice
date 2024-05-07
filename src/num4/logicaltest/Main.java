package num4.logicaltest;

public class Main {
    public static void main(String[] args) {
        boolean x;
        boolean y;
        boolean z;
        boolean b;

        x=false;
        y=z=true;
        b=x||y&&z;//b=x||(y&&z);
        System.out.println("x=" + x + ", y=" + y + ", z=" + z + ", b=" + b);
    }
}
