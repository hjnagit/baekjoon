package step1;  // 주사위 세개

import java.util.Scanner;

public class Main2480 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if(A==B && A==C) {
			System.out.println(10000 + A * 1000);
		} else if((A==B && A!=C) || (A==C && A!=B)) {
			System.out.println(1000 + A * 100);
		} else if(B==C && B!=A) {
			System.out.println(1000 + B * 100);
		} else if(A>B && A>C) {
			System.out.println(A * 100);
		} else if(B>A && B>C) {
			System.out.println(B * 100);
		} else if(C>B && C>A) {
			System.out.println(C * 100);
		}

	}

}
