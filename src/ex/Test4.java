package ex;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		//원의 넓이 구하기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원의 반지름 값을 입력하시오 >>>");
		
		int r = sc.nextInt();
		
		double result = r*r*Math.PI;
		
		System.out.println(Math.round(result*100)/100.0);
		
	}

}
