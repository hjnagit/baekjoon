package test1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i = 0; i < a; i++) {
			int h = sc.nextInt();  // ����
			int w = sc.nextInt();  // ���
			int n = sc.nextInt();  // �մ�
			
			int t = n; // ��� �� ����
			int num = 1; // ȣ��
			
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
