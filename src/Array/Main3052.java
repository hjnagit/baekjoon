package Array;

import java.util.Scanner;

public class Main3052 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] n = new int[10];
		
		for(int i = 0; i < arr.length ; i++) {
			n[i] = arr[i]%42;
		}
		
		int s = 0;
		
		for(int i = 0 ; i < n.length ; i++) {
			for(int j = 0 ; i < n.length ; i++) {
				if(n[i] != n[j]) s++;
			}
		}
		System.out.println(s);

	}

}
