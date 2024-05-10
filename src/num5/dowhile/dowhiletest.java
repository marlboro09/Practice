package num5.dowhile;

public class dowhiletest {
    public static void main(String[] args) {
        int i;
        int j;

        i=10;
        do{
            j=0;
            do{
                System.out.print("*");
                j++;      //j값 증가
            } while (j<i);//j값이 i값보다 작으면 반복
            System.out.println();
            i--;    //i값을 감소
        }while(i>0);//i값이 0보다 크면 반복
    }
}
