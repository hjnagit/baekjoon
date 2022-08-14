package test1;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = n;
		
		int a = 0;
		int r = 0;
	
		while(true) {
			
			if(n<10) {
				System.out.println(0);
				return;
			}
			
			n--;
			int z = n;
			int sum = 0;
			
			while(z != 0) {
				a = z%10;
				z = z/10;
				sum += a;
			}
			r = n + sum;
			
			if(r == m) break;
			else if (n == 0) {
				System.out.println(0);
				return;
			}
			
			
		}
		
		System.out.println(n);

	}

}
