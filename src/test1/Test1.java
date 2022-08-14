package test1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i = 0; i < a; i++) {
			int h = sc.nextInt();  // Ãþ¼ö
			int w = sc.nextInt();  // ¹æ¼ö
			int n = sc.nextInt();  // ¼Õ´Ô
			
			int t = n; // °è»ê ÈÄ Ãþ¼ö
			int num = 1; // È£½Ç
			
			while(true) {
				t -= h;
				num++;
				if(t<h) break;
			}
			
			if(num > 9) {
				System.out.print(t);
                System.out.print(num);
			}else {
                System.out.print(t);
                System.out.print(0);
                System.out.print(num);
			}
		}
			

	}

}
