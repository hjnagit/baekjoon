package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main25305 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//첫 줄 2개 
		//두번째 줄 점수
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		ArrayList<Integer> list = new ArrayList<>();
		
		int num = Integer.parseInt(st.nextToken());
		int grade = Integer.parseInt(st.nextToken());
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < num; i++) {
			list.add(Integer.parseInt(st2.nextToken()));
		}
		
		Collections.sort(list);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		
		for(Integer i : list) {
			list2.add(i);
		}
		
		System.out.println(list2);
		System.out.println(list2.get(num - grade));
		
		
		
		
	}

}
