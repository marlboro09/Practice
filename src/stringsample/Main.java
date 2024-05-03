package stringsample;

public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + str2;

        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);
        System.out.println("str3 : " + str3);
        System.out.println("str1의 크기는 " + str1.length() + "입니다");
        System.out.println("str2를 소문자로 바꾸면 " + str2.toLowerCase() + "입니다");//모든 글자를 소문자로 표시
        System.out.println("str3의 l을 L로 바꾸면 " + str3.replace('l', 'L') + "입니다");//모든 l을 대문자 L로 변경
        System.out.println("str2의 3번째 문자는 " + str2.charAt(2) + "입니다");// 0부터 시작하므로 2는 3번째자리를 의미함
    }
}
