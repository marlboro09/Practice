package num2.horoscope;

import java.util.Date;
import java.util.Random;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {

        Date today = new Date();//Date 클래스 객체 생성
        SimpleDateFormat dateForm = new SimpleDateFormat(("yyyy년 mm월 dd일의 "));//오늘 날짜를 축력을 어떻게 할건지
        System.out.print(dateForm.format(today));

        Random r = new Random();
        int randomNum = Math.abs(r.nextInt()%100)+1;
        System.out.println("오늘의 금전운 : " + randomNum + "%");
    }
}
