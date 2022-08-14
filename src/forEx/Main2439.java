package forEx;  //º°Âï±â2

import java.util.Scanner;

public class Main2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int p = (n-i); p > 0; p--) {
				System.out.print(" ");
			}
			for(int j = 0; j < i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
