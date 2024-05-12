package num6.pointtest;

import java.awt.*;

public class PointTest {
    public static void main(String[] args) {
        Point p = new Point(); // Point클래스 객체 생성
        p.x = 10;   //Point 클래스의 멤버변수 x에 저장
        p.y = 20;   //Point 클래스의 멤버변수 y에 저장
        p.printXY();//Point 클래스의 printXY() 메서드 실행
    }
}


class Point{    //Point클래스 정의
    int x;  //멤버변수
    int y;
    public void printXY() {
        System.out.println("x=" + x + ", y=" + y);  //메서드
    }
}

//Point클래스의 객체로 p로 생성한 후에 p의 멤버변수 x, y에 10과 20을 저장
//p의 printXY() 메서드를 호출하면 저장된 x, y값이 출력

