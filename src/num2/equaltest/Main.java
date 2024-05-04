package num2.equaltest;

public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = str1;
        String str4 = str2;

        System.out.println("== 관계");
        System.out.println("str1 == str1 : " + (str1 == str1));//같은 변수 true
        System.out.println("str1 == str2 : " + (str1 == str2));//문자열의 내용은 같지만 메모리 주소가 다르니 false
        System.out.println("str1 == str3 : " + (str1 == str3));//str3는 str1을 복사한 변수니 같음 true
        System.out.println("str1 == str4 : " + (str1 == str4));//str4는 str2를 복사한 변수니 다르다 false
        System.out.println();

        System.out.println("Equal 관계");
        System.out.println("str1 equals str1 : " + (str1.equals(str1)));//같은 변수니까 true
        System.out.println("str1 equals str2 : " + (str1.equals(str2)));//메모리 주소는 다르지만 문자열은 같으니까 true
        System.out.println("str1 equals str3 : " + (str1.equals(str3)));//str3는 str1과 같으니까 true
        System.out.println("str1 equals str4 : " + (str1.equals(str4)));//str4는 str2를 복사한거니까 같은 문자열
    }
}
