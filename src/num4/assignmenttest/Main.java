package num4.assignmenttest;

public class Main {
    public static void main(String[] args) {
        int x;
        int y;
        int z;

        x=y=z=1;
        z += x+y;//z=z+x+y;
        System.out.println("x =" + x + ", y=" + y + ", z=" + z);

        x += y -= z = 5;//z=5; y=y-z; x=x+y;
        System.out.println("x =" + x + ", y=" + y + ", z=" + z);
    }
}
