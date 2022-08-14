package mathtest;

import java.util.*;
import java.io.*;

public class Main2869 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(sc.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());

		
//		int num = 0;
//		int n = 0;
//		while(true) {
//			num += a;
//			n++;
//			if(num >= v) {
//				break;
//			} else {
//				num -= b;			
//			}
//		}
//		System.out.println(n);
		
		int t = v-a;
		int y = a-b;
		
		if(t == 0) {
			System.out.println(1);
			return;
		}
		
		long x = (t%y>=1 ? t/y+1 : t/y);
		
		System.out.println(x+1);

		
		
		
	}

}
