package ex;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		//���� ���� ���ϱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ������ ���� �Է��Ͻÿ� >>>");
		
		int r = sc.nextInt();
		
		double result = r*r*Math.PI;
		
		System.out.println(Math.round(result*100)/100.0);
		
	}

}
