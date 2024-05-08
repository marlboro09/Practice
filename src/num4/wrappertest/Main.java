package num4.wrappertest;

public class Main {
    public static void main(String[] args) {

        int MyInt = 5316;
        System.out.println("MyInt: " + MyInt);

        String myString = new Integer(MyInt).toString();//int -> Integer형 객체 -> String형 객체
        System.out.println("myString: " + myString);

        myString = myString.replace('6','4');//6을 4로 변경

        float myfloat = Float.valueOf(myString).floatValue();//String형 객체 -> Float형 객체 -> float
        System.out.println("myfloat: " + myfloat);
    }
}
