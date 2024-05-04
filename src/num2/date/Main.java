package num2.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat dateForm = new SimpleDateFormat("yyyy년 MM월 dd일 mm분 ss초");
        // 날짜 출력 형식 지정
        System.out.println(dateForm.format(today));
        //미리 지정한 출력 형식에 맞춰서 출력
    }
}
