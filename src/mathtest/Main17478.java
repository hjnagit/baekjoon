package mathtest;

import java.util.Scanner;

public class Main17478 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Recursion1 r = new Recursion1();
		
		int n = sc.nextInt();
		
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		
		
		for(int i = 0; i < n; i++) {
			for(int j = 1; j <= i; j++ ) {
				System.out.print("____");
			}
			r.getS1();
			for(int j = 1; j <= i; j++ ) {
				System.out.print("____");
			}
			r.getS2();
			for(int j = 1; j <= i; j++ ) {
				System.out.print("____");
			}
			r.getS3();
			for(int j = 1; j <= i; j++ ) {
				System.out.print("____");
			}
			r.getS4();
			
			if(i == n-1) {
				for(int a = 0; a < n; a++) {
					System.out.print("____");
				}
				r.getS1();
				for(int a = 0; a < n; a++) {
					System.out.print("____");
				}
				System.out.println("\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
				
				for(int b = n; b >= 0; b--) {
					for(int a = 0; a < b; a++) {
						System.out.print("____");
					}
					System.out.println("��� �亯�Ͽ���.");
				}
				
			}
			
		}
		
		
		
	}

}

class Recursion1{
	
	public void getS1() {
		System.out.println("\"����Լ��� ������?\"");
	}
	
	public void getS2() {
		System.out.println("\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
	}
	
	public void getS3() {
		System.out.println("���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
	}
	
	public void getS4() {
		System.out.println("���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
	}

}
