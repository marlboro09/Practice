package num4.compare;

public class compare1 {
    public static void main(String[] args) {
        Integer x = new Integer(100);
        Integer y = new Integer(100);

        if(x==y) {
            System.out.println(x + "==" + y);
        } else {
            System.out.println(x + "!=" + y);//x,y에 100을 저장했는데 다르다는 결과가 출력
        }
    }
}
