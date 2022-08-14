package Array;

import java.util.Scanner;

public class Main2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		int max = Integer.MIN_VALUE;
		int num = 0;
		
		for(int i = 0; i <arr.length; i ++) {
			arr[i] = sc.nextInt();
			if(max<arr[i]) {
				max = arr[i];
				num = i;
			}
		}
		System.out.println(max);
		System.out.println(num+1);

	}

}
