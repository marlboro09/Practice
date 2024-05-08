package num4.gamejava2;

import java.util.*;
import java.io.*;

public class Gamejava2 {
    public static void main(String[] args) throws Exception {
        int x;
        int y;

        Random r=new Random();
        if(args.length==1) { //인수가 있으면 인수로 준 값으로 문제를 축제
            x=Integer.valueOf(args[0]).intValue();
            //인수는 String형이므로 랩퍼 클래스를 사용해 int형으로 변환
        } else {
            x= Math.abs((r.nextInt()%9))+1;
        }

        y=Math.abs((r.nextInt()%9))+1;

        int num = x*y;

        System.out.println();
        System.out.println("* 구구단" + x + "단");
        System.out.println();

        System.out.println(x + " * " + y + " = ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String user;
        user = in.readLine();//키보드로부터 입력

        int inputNum = new Integer(user).intValue();
        //키보드에서 입력받은 값은 String형이므로 랩퍼클래스를 사용해 int형으로 변환

        if(num==inputNum) {
            System.out.println("맞았다");
        } else {
            System.out.println("틀렸다. 정답은 : " + num);
        }

    }
}
