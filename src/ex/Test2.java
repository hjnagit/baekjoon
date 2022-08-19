package ex;

public class Test2 {

	public static void main(String[] args) {
		// 숫자 합, 홀수 구하기
		int sum = 0;
		for(int i=1; i<101; i++) {
			sum += i;
		}
		System.out.println("1~100까지의 합 : " + sum);
		
		
		for(int i =1; i <10; i++) {
			if(i%2 != 0) {
				System.out.println("홀수 : " + i);
			}
		}
		
		
	}

}
