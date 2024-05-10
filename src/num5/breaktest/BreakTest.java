package num5.breaktest;

public class BreakTest {
    public static void main(String[] args) {
        int i,j;

        i=10;
        OUT_WHILE: while (true){
            j=0;
            while(true) {
                System.out.print("*");
                j++;
                if(j>=i) break; //j값이 i값보다 크거나 같으면 퇴출
            }
            System.out.println("");
            i--;
            if(i<=0) break OUT_WHILE;//i값이 0보다 작거나 같으면 퇴출
        }
    }
}
