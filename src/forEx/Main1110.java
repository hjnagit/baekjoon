package forEx;

import java.util.Scanner;

public class Main1110 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num  = sc.nextInt();
//		if(num <10) {
//			num = num *10;
//		} 
		
		
		
		int num1 = num%10;
		int num2 = num/10;
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum != num) {
				sum = num1+num2;
				// sum의 나머지와 이전 
				if(sum != num) {
				num1 = sum%10;
				num2 = sum/10;
				
				
				}
				i++;
				
			} 
			else if(sum == num) {
				System.out.println(i);
				break;
			}
			
				
			
		}

	}

}
