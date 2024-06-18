package gamehangman;

import java.io.IOException;

public class HangmanMain {
	public static void main(String[] args) throws IOException {
		Hangman hangman = new Hangman();

		int result = hangman.playGame(); // 게임을 실행

		System.out.println();
		if(result<=2) {
			System.out.println("1등");
		} else if (result<=3) {
			System.out.println("2등");
		} else if (result<=4) {
			System.out.println("3등");
		} else {
			System.out.println("꼴찌");
		}
	}
}
