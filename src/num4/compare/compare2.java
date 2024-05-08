package num4.compare;

public class compare2 {
    public static void main(String[] args) {
        Integer x = new Integer(100);
        Integer y = new Integer(100);

        if(x.equals(y)) {
            System.out.println(x + "==" + y);//equals를 사용해서 같다가 표시
        } else {
            System.out.println(x + "!=" + y);
        }
    }
}
