package step1;  //빠른 알람

import java.util.Scanner;

public class Main2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m>=45) {
			System.out.println(h + " " + (m-45));
		} else if(h==0) {
			System.out.println(23 + " " + (m+15));
		} else System.out.println((h-1) + " " + (m+15));

	}

}
