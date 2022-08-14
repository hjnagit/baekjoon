package step1;  // 오븐시간 계산

import java.util.Scanner;

public class Main2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int f = sc.nextInt();
		
		int x;
		
		if((h+(m+f)/60) >=24) {
			x = (h+(m+f)/60)%24;
		} else x= h+(m+f)/60;

		System.out.println(x +" " + (m+f)%60);
		
	}

}
