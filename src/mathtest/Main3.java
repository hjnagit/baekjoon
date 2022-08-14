package mathtest;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		int result = num/6 + 1;
		int n = num/(6*result) + 2;
		System.out.println(n);

	}

}
