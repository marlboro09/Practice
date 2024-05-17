package sparta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Lotto {
	public static void main(String[] args) {
		HashSet lotto = new HashSet();
		int randomNum;
		for(int i = 0; i < 7; i++) {
			randomNum = (int)(Math.random() * 45) + 1;
            lotto.add(randomNum);
		}
		ArrayList<Integer> list = new ArrayList<Integer>(lotto);
		Collections.sort(list);
		System.out.println("번호는?" + list);
	}
}
