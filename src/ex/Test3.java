package ex;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		//������ �Է¹޾� ����ϱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ��Ģ���� ���α׷��� �ʿ��� �����ڸ� �Է��Ͻÿ�.");
		System.out.println("(+, -, *, /) >> ");
		String s = sc.next();
		
		System.out.println("������ ������ �Է��Ͻÿ� >>");
		int num1 = sc.nextInt();
		System.out.println("������ ������ �Է��Ͻÿ� >>");
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
