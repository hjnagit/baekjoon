package mathtest;

public class Main1978 {

	public static void main(String[] args) {
		
		int n = 6;
		int num = 0;
		
		for(int i = 2; i < n; i++) {
			for(int j = 2; j < n; j++) {
				if(i*j == n) {
					num++;
					continue;
				}
			}
			
			
		}
		
		System.out.println(num);
		
		
		
		
		
		
		
		
		
		
	}

}
