package step1;  //시계 시 분

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		
		System.out.println(c/60 +"시 " + c%60 + "분");

	}

}
