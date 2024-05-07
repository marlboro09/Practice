package num4.relationtest;

public class Main {
    public static void main(String[] args) {
        int x, y, z;
        boolean b;

        x=y=z=1;
        b=((x-->0)||(++y != 0)&&(--z == 0));//x-->0 true, ++y!=0 true, --z==0 true 따라서 b=true
        System.out.println("x=" + x + ", y=" + y + ", z=" + z +", b=" + b);
    }
}
