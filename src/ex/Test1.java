package ex;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		String[] datas = new String[3];
		datas[0] = "가";
		datas[1] = "나";
		datas[2] = "다";
		
		System.out.println(Arrays.toString(datas));
		
		String[] name = new String[3];
		name[0] = "홍길동";
		name[1] = "이순신";
		name[2] = "유관순";
		
		for(String s : name) {
			System.out.println(s);
		}
		
		
		
		
		
	}

}

