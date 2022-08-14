package mathtest;

import java.util.Scanner;

public class Main2231 {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = n;
		
		int a = 0;
		int sum = 0;
		int r = 0;
	
		while(true) {
			
			n--;
			int z = n;
			while(z != 0) {
				a = z%10;
				sum += a;
				z = z/10;
				System.out.println(z);
			}
			
			r = n + sum;
			
			if(r == m) break;
		}
		
		System.out.println(n);
		
		
	}

}
