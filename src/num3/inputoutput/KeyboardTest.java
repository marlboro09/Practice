package num3.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardTest {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);//InputStream 객체에 리더를 연결
        BufferedReader in = new BufferedReader(isr);//리더에 다시 버퍼를 연결

        String str;
        System.out.println("글씨를 입력하면 똑같이 입력 됩니다");
        str = in.readLine();//키보드로 한 줄 입력을 받는다
        System.out.println(str);
    }
}
