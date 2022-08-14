package Array;

import java.util.Scanner;

public class Main2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int totalNum = a*b*c;
        
        String s = Integer.toString(totalNum);
        String[] s1 = s.split("");
        
        
        
        String[] num = new String[10];
        for(int i = 0; i < num.length; i++) {
        	num[i] = i + "";
        }
        int[] n = new int[10];
        for(int i = 0; i < num.length; i++) {
        	for(int j = 0; j < s1.length; j++) {
        		if(s1[j].equals(num[i])) {
        			n[i] += 1;
        		}
        		
        	}
        	System.out.println(n[i]);
        	
        }
        
        
        
	}

}
