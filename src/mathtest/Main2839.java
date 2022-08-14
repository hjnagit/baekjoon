package mathtest;

import java.util.Scanner;

public class Main2839 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int num1 = 0; // °¹¼ö
		int num2 = 0;
		
		if(n%5 == 0) { // 5ÀÇ ¹è¼ö
			num1 = n/5;
			System.out.println(num1);
		}
		else if((n%5)%3 == 0) {
			num1 = n/5;
			num2 = (n%5)/3;
			System.out.println(num1+num2);
		}
		else{
			if(n>10) {
				switch (n%10) {
				case 1: case 6: System.out.println((n-6)/5+2);
				break;
				case 2: System.out.println((n-12)/5+4);
				}
			}
		}
		
		
		
	}
}
