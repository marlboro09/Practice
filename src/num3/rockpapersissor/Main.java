package num3.rockpapersissor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {

        //0~2 사이 난수를 구한다
        Random random = new Random();
        int computer = Math.abs(random.nextInt() % 3);//난수를 구해서 3으로 나눈 나머지

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String user;
        System.out.println("가위, 바위, 보 중 하나를 선택하세요 : ");
        user = in.readLine();

        if(user.equals("가위")) {
            if(computer == 0) {
                System.out.println("컴퓨터 가위 : 무승부!");
            }
            if(computer == 1) {
                System.out.println("컴퓨터 바위 : 컴퓨터 승리!");
            }
            if(computer == 2) {
                System.out.println("컴퓨터 보 : 유저 승리!");
            }
        }else if (user.equals("바위")) {
                if (computer == 0) {
                    System.out.println("컴퓨터 가위 : 유저 승리!");
                }
                if (computer == 1) {
                    System.out.println("컴퓨터 바위 : 무승부!");
                }
                if (computer == 2) {
                    System.out.println("컴퓨터 보 : 컴퓨터 승리!");
                }
            } else if (user.equals("보")) {
                if (computer == 0) {
                    System.out.println("컴퓨터 가위 : 컴퓨터 승리!");
                }
                if (computer == 1) {
                    System.out.println("컴퓨터 바위 : 유저 승리!");
                }
                if (computer == 2) {
                    System.out.println("컴퓨터 보 : 무승부!");
                }
            }

            }
        }

