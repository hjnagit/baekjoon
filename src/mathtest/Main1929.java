package mathtest;

import java.util.Scanner;

public class Main1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		
		for(int i = a; i <= b; i++) {
			boolean isPrime = true;
			
			if(i == 1) {
				isPrime = false;
				continue;
			}
			
			for(int j = 2; j <= Math.sqrt(i); j++) {
				if(i%j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				System.out.println(i);
			}
			
			
			
		}
		
		
		
	}

}
