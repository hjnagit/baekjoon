package ex;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		//연산자 입력받아 계산하기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 사칙연산 프로그램에 필요한 연산자를 입력하시오.");
		System.out.println("(+, -, *, /) >> ");
		String s = sc.next();
		
		System.out.println("연산할 정수를 입력하시오 >>");
		int num1 = sc.nextInt();
		System.out.println("연산할 정수를 입력하시오 >>");
		int num2 = sc.nextInt();
		
		int result = 0;
		switch(s) {
		case "+" :
			result = num1+num2;
			break;
		case "-":
			result = num1-num2;
			break;
		case "*":
			result = num1*num2;
			break;
		case "/":
			result = num1/num2;
			break;
		}
		
		System.out.println(num1 + s + num2 + " = " + result);
		
	}

}
