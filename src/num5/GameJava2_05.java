package num5;

import java.io.*;
import java.util.*;

/**
 * The type Game java 2 05.
 */
public class GameJava2_05 {
    /**
     * Playgame int.
     *
     * @return the int
     * @throws IOException the io exception
     */
    public static int playgame() throws IOException {
        int x, y, z;
        Random r= new Random();
        x=Math.abs(r.nextInt() % 9) + 1;

        do {
            y=Math.abs(r.nextInt() % 9) + 1;
        } while (y==x); //x와 y값이 같지 않도록 반복

        do {
            z=Math.abs(r.nextInt() % 9) + 1;
        } while ((z==x)||(z==y));

        System.out.println(x + "," + y + "," + z);

        return playGame(x, y, z);
    }

    public static int playGame(int x, int y, int z) throws IOException {
        int count;
        int strike, ball;

        int [] usr = new int[3];//사용자가 입력한 숫자 3개
        int [] com = {x, y, z};//컴퓨터가 숨긴 숫자 3개

        System.out.println("숫자 야구 게임");

        count = 0;

        do {
            count++;
            do{
                System.out.println("\n 카운트"+count);

                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                String user;

                System.out.println("1번째 숫자 :");
                user = in.readLine();//키보드로 1번째 숫자 입력
                usr[0] = new Integer(user).intValue();//입력받은 문자를 int형 숫자로 변환

                System.out.println("2번째 숫자 :");
                user = in.readLine();//키보드로 2번째 숫자 입력
                usr[1] = new Integer(user).intValue();//입력받은 문자를 int형 숫자로 변환

                System.out.println("3번째 숫자 :");
                user = in.readLine();//키보드로 3번째 숫자 입력
                usr[2] = new Integer(user).intValue();//입력받은 문자를 int형 숫자로 변환

                if((usr[0]==0)||(usr[1]==0)||(usr[2]==0)){
                    System.out.println("0은 입력이 되지 않습니다.");
                } else if ((usr[0]>9)||(usr[1]>9)||(usr[2]>9)) {
                    System.out.println("1~9 사이의 숫자를 입력하세요.");
                } else if ((usr[0]==usr[1])||(usr[1]==usr[2])||(usr[0]==usr[2])) {
                    System.out.println("중복된 숫자는 입력이 되지 않습니다.");
                }
            } while ((usr[0]==0)||(usr[1]==0)||(usr[2]==0)||
                    (usr[0]>9)||(usr[1]>9)||(usr[2]>9)||
                    (usr[0]==usr[1])||(usr[1]==usr[2])||(usr[0]==usr[2]));
            //입력받은 답에 이상이 없을 때 (1 ~ 9 모두 다른 숫자)까지 반복

            strike = ball = 0; //볼카운트 초기화

            if(usr[0]==com[0]) strike++;
            if(usr[1]==com[1]) strike++;
            if(usr[2]==com[2]) strike++; //strike 계산

            System.out.println("Strike : " + strike);

            if(usr[0]==com[1]) ball++;
            if(usr[0]==com[2]) ball++;
            if(usr[1]==com[0]) ball++;
            if(usr[1]==com[2]) ball++;
            if(usr[2]==com[0]) ball++;
            if(usr[2]==com[1]) ball++;  //ball 계산

            System.out.println("Ball : " + ball); //볼카운트 출력
        } while ((strike<3)&&(count<11)); // 답을 맞혔거나 10번 이상 시도해서 못 맞출 때까지 반복

        return count;//문제를 맞히려고 시도한 횟수를 반환
    }

    public static void main(String[] args) throws IOException {
        int result;

        if(args.length==3) {
            int x = Integer.valueOf(args[0]).intValue(); //인수는 String형이므로 int형으로 형변환
            int y = Integer.valueOf(args[1]).intValue();
            int z = Integer.valueOf(args[2]).intValue();

            result = playGame(x, y, z); // 인수를 playGame 메서드에 전달
        } else {                 //인수가 없는 경수
            result = playgame(); // 인수가 없으면 playgame 메서드 호출
        }

        System.out.println();
        if (result<=2) { // 문제를 푼 횟수에 따라 메시지 출력
            System.out.println("개고수");
        } else if(result<=5) {
            System.out.println("고수");
        } else if (result<=9) {
            System.out.println("중수");
        } else {
            System.out.println("허접");
        }
    }
}
