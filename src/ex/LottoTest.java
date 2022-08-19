package ex;

import java.util.Arrays;
import java.util.Random;

public class LottoTest {

	public static void main(String[] args) {
		int[] lotto = new int[7];
		
		Random rand = new Random();
		
		for(int i = 0; i < lotto.length; i++) {
			int num = rand.nextInt(45)+1;
			boolean isContain = false;
			
			for(int j = 0; j < i; j++) {
				if(num == lotto[j]) {
					isContain = true;
					break;
				}
			}
			
			if(isContain) {
				i--;
				continue;
			}
			
			lotto[i] = num;
			
			}
			
			
		
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));

	}

}
