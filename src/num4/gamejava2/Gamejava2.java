package num4.gamejava2;

import java.util.*;
import java.io.*;

public class Gamejava2 {
    public static void main(String[] args) throws Exception {
        int x;
        int y;

        Random r=new Random();
        if(args.length==1) {
            x=Integer.valueOf(args[0]).intValue();
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
        user = in.readLine();

        int inputNum = new Integer(user).intValue();

        if(num==inputNum) {
            System.out.println("맞았다");
        } else {
            System.out.println("틀렸다. 정답은 : " + num);
        }

    }
}
