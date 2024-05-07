package num4.shortcircuitecaluation;

//최단 평가
//자바는 &&(and)조건이 false이거나 ||(or)조건이 true인 경우 그 이후에 나오는 조건은 평가하지 않는다
public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;

        if((++a>3)&&(++b>8)){
            System.out.println("if문이 실행되었습니다");//++a는 3이기 때문에 ++a>3이 false가 되서 ++b는 수행이 되지않는다
        }

        System.out.println("a : " + a + ", b : " + b);//a : 3, b : 4

    }
}
