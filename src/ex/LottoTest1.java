package ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LottoTest1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> lotto = new ArrayList<>();
		
		Random rand = new Random();
		
		while(lotto.size() < 8) {
			int num = rand.nextInt(45)+1;
			if(!lotto.contains(num)) {
				lotto.add(num);
			}
		}
		
		Collections.sort(lotto);
		System.out.println(lotto.toString());
		
		for(int data : lotto) {
			System.out.println(data);
		}

	}

}
