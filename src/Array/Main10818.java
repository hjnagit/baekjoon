package Array;

import java.util.Scanner;

public class Main10818 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		int[] arr = new int[i];
		int mx = Integer.MIN_VALUE;;
		int mn = Integer.MAX_VALUE;;
		
		for(int j = 0; j < i; j++) {
			arr[j] = sc.nextInt();
			if(mx<arr[j]) mx = arr[j];
			if(mn>arr[j]) mn = arr[j];	
		}
		System.out.println(mn + " " + mx);

	}

}
