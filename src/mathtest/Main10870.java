package mathtest;

import java.util.Scanner;

public class Main10870 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a = 0;
		int b = 1;
		int x;
		
		if(n == 0) { //0,1의 예외처리
			System.out.println(0);
			return;
		}
		if(n == 1) {
			System.out.println(1);
			return;
		}
		
		for(int i = 2; i <= n; i++) {
			x = b;
			b += a;
			a = x;
		}
		System.out.println(b);
		
	}

}
