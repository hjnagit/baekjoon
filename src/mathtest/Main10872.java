package mathtest;

import java.util.Scanner;

public class Main10872 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n == 0) {
			System.out.println(1);
			return;
		}
		
		for(int i = n-1; i > 0; i--) {
			n = n * i;
		}
		
		System.out.println(n);
		
		
	}

}
