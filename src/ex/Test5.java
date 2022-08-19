package ex;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		//정수를 입력받아 가장 큰 정수 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<5; i++) {
		
			System.out.println("정수를 입력하시오 >>>");
			int num = sc.nextInt();
			
			if(max < num) max = num;
		
		}
		
		System.out.println("가장 큰 수 : " + max);
	}

}
