package stringtest;

import java.io.IOException;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) throws IOException {
		
//		int a = System.in.read()-48;
//		
//		int sum = 0;
//		for(int i = 0; i < a; i++) {
//			sum += System.in.read()-48;
//			System.out.println(sum);
//		}
		Scanner sc = new Scanner(System.in);
        sc.nextLine();
        long a = sc.nextInt();
        long tot = 0;
        while (a > 0) {
            tot += a % 10;
            a /= 10;
        }
        System.out.println(tot);
		
		

	}

}
