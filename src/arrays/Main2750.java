package arrays;

import java.util.Scanner;
import java.util.TreeSet;

public class Main2750 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		System.out.println("숫자 입력>>>");
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		ts.add(Integer.parseInt(br.readLine()));
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			ts.add(sc.nextInt());
		}
		
		ts.forEach(s->System.out.println(s));
				
	}

}
