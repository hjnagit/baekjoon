package ex;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		//������ �Է¹޾� ���� ū ���� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<5; i++) {
		
			System.out.println("������ �Է��Ͻÿ� >>>");
			int num = sc.nextInt();
			
			if(max < num) max = num;
		
		}
		
		System.out.println("���� ū �� : " + max);
	}

}
