package num5.callbyvalue;

public class CallbyValueTest2 {
    static int a;
    static int b;

    public static void swap() {
        int temp = a;//a의 값을 저장
        a = b;       //전역변수에 바로 저장
        b = temp;
    }

    public static void main(String[] args) {

        a=10;
        b=20;

        System.out.println("호출 전 : " + a + "," +b );//10, 20 출력
        swap();//인수 없이 호출
        System.out.println("호출 후 : " + a + "," +b );//20, 10 출력
        //swap 메서드에서 전역변수로 바로 값을 저장하기 때문에 swap이후에 값이 바뀌어 출력
    }
}
