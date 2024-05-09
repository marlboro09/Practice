package num5.callbyvalue;

public class CallbyValueTest1 {
    public static void swap(int x, int y) {
        int temp = x;//x값을 보관
        x = y;
        y = temp;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("swap() 메서드 호출 전 : "+ a + "," + b);// 10,20출력
        swap(a, b);//x에는 a, y에는 b를 전달
        System.out.println("swap() 메서드 호출 후 : "+ a + "," + b);// 10,20출력
    }
    //main 메서드의 a와 b는 swap메서드 내의 x와 y에 각각 값이 복사되고 swap메서드에서는 x와 y만 다루기 때문에
    //swap 내에서 x와 y의 값을 서로 바꾸지만 main 메서드의 a와 b에는 아무런 영향을 미치지 않음
}
