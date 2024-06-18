package gamehangman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hangman {
	String hiddenString;        //숨겨진 문자열(문제)
	StringBuffer outputString;  //플레이어의 입력에 따른 결과를 보여줄 문자열
	StringBuffer inputString;    //플레이어가 입력한 문자들의 모임
	int remainder;                //맞힐 문자열(못 맞히고 남아있는 문자의 수
	int failed;                    //실패한 횟수

	public Hangman() throws IOException {
		hiddenString = "hello"; //문제는 hello
	}

	public int playGame() throws IOException {
		outputString = new StringBuffer();

		for (int i = 0; i < hiddenString.length(); i++) { //hiddenString의 문자수만큼 ' - ' 출력
			outputString.append('-');
		}

		inputString = new StringBuffer();

		remainder = hiddenString.length(); // hiddenString의 문자수가 맞힐 문제의 문자수
		failed = 0;

		System.out.println("\n단어(" + hiddenString.length() + "글자" + "):" + outputString);
		drawMan(); //그림

		do {
			checkChar(readChar()); //한 문자를 입력받아 정답을 확인
			System.out.println("\n단어(" + hiddenString.length() + "글자" + "):" + outputString);
			drawMan(); //입력 문자에 따른 교수대 출력
		} while ((remainder > 0) && (failed < 6)); // 문제를 맞히거나 6번 이상 틀릴 때까지 반복
		return failed;
	}

	public void checkChar(char guess) {
		boolean already = false;
		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i) == guess) { // 이미 입력했던 문자인지 조사
				System.out.println("\n 이미 입력한 문자입니다. 다시 입력해주세요.");
				already = true;
				break;
			}
		}
		if (!already) {
			inputString.append(guess); // 입력한 문자들의 모임에 추가
			boolean success = false;
			for (int i = 0; i < hiddenString.length(); i++) { //문제에 해당 문자가 있는지 조사
				if (hiddenString.charAt(i) == guess) {
					outputString.setCharAt(i, guess);  //문제에 문자가 있으면 -를 문자로 변경
					remainder--;                       //맞힐 문자수 1감소
					success = true;                    //입력한 문자가 문제에 있었음을 표시
				}

			}
			if (!success) {
				failed++; // 입력한 문자가 문제에 없으면 실패 횟수를 1증가
			}
		}
	}

	public void drawMan() {
		System.out.println("     ⌈‾‾⌉");
		System.out.println("     |  |");

		switch (failed) {
			case 0 :
				System.out.println("        |");
				System.out.println("        |");
				System.out.println("        |");
				System.out.println("        |");
				System.out.println("        |");
				System.out.println("        |");
				break;
			case 1 :
				System.out.println("     ◉  |"); //1번 실패할 경우의 그림
				System.out.println("        |");
				System.out.println("        |");
				System.out.println("        |");
				System.out.println("        |");
				System.out.println("        |");
				break;
			case 2 :
				System.out.println("     ◉  |"); //2번 실패할 경우의 그림
				System.out.println("    ⌈Τ  |");
				System.out.println("        |");
				System.out.println("        |");
				System.out.println("        |");
				System.out.println("        |");
				break;
			case 3 :
				System.out.println("     ◉  |"); //3번 실패할 경우의 그림
				System.out.println("    ⌈Τ  |");
				System.out.println("     |  |");
				System.out.println("        |");
				System.out.println("        |");
				System.out.println("        |");
				break;
			case 4 :
				System.out.println("     ◉  |"); //4번 실패할 경우의 그림
				System.out.println("    ⌈Τ⌉ |");
				System.out.println("     |  |");
				System.out.println("        |");
				System.out.println("        |");
				System.out.println("        |");
				break;
			case 5 :
				System.out.println("     ◉  |"); //5번 실패할 경우의 그림
				System.out.println("    ⌈Τ⌉ |");
				System.out.println("     |  |");
				System.out.println("    ⌈‾  |");
				System.out.println("    |   |");
				System.out.println("        |");
				break;
			case 6 :
				System.out.println("     ◉  |"); //6번 실패할 경우의 그림
				System.out.println("    ⌈Τ⌉ |");
				System.out.println("     |  |");
				System.out.println("    ⌈‾⌉ |");
				System.out.println("    | | |");
				System.out.println("        |");
				break;
		}
	}

	public char readChar() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String user;

		System.out.println("1 문자를 입력하세요 : ");
		user = in.readLine();  //키보드로부터 한 줄을 입력
		return user.charAt(0); //입력받은 문자열 중 첫 번째 문자를 반환
	}
}
