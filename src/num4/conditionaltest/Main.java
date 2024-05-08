package num4.conditionaltest;

public class Main {
    public static void main(String[] args) {
        int hour;
        int min;
        int sec;

        hour = 13;
        min = 30;
        sec = 25;

        String ampm;
        ampm = (hour >= 12)? "PM" : "AM"; //오전과 오후를 결정
        hour = (hour >= 12)? (hour - 12) : hour; // 24시간 표기를 12시간 표기로 변경

//        if(hour >= 12) {
//            ampm = "PM";
//        } else {
//            ampm = "AM";
//        }
//        if(hour >= 12) {
//            hour = hour - 12;
//        } else {
//            hour = hour;
//        }//위에 내용을 if문으로 바꾸면 지금 내용이 된다

        System.out.println(ampm + " " + hour + ":" + min + ":" + sec);

    }
}
