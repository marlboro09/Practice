package num4.casttest;

public class Main {
    public static void main(String[] args) {

        int myInt;
        float myFloat = (float) 3.0;
        double myDouble;

        myInt = (int) myFloat;//float을 int로 변환
        myDouble = myInt;
        System.out.println("myInt = " + myInt + ", myFloat = " + myFloat + ", myDouble = " + myDouble);

    }
}
