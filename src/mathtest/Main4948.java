package mathtest;

import java.util.Scanner;

public class Main4948 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
			int n = sc.nextInt();
		
			if(n == 0) break;
		
			int count = 0;
		
			for(int i = n; i <= n+n; i++) {
			
				boolean isPrime = true;
			
				if(i == 1) {
					isPrime = false;
					continue;
				}
			
				for(int j = 2; j <= Math.sqrt(n+n); j++) {
					if(i%j == 0) {
						isPrime = false;
						break;
					}
				}
			
				if(isPrime) {
					count++;
				}
			
			}
		
			System.out.println(count);
		
		}
	}

}
