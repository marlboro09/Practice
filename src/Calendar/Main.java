package Calendar;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();//Calendar는 반드시 getInstance()로 메서드를 생성해야된다

        int hour = now.get(Calendar.HOUR);//get() 메서드로 시간 정보 얻기 선언
        int min = now.get(Calendar.MINUTE);

        System.out.println("현재시간 " + hour + "시 " + min + "분 입니다");
    }
}
