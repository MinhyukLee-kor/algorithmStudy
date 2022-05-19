package algorithm20220519;

import java.util.Scanner;

public class Baekjoon_2884 {

	public static void main(String[] args) {
		// 백준 2단계 5번
		
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int m = scan.nextInt();
		
		if(m>=45) {
			m = m-45;
			System.out.println(h+" "+m);
		} else {
			h = h-1;
			m = m +15; // m-45+60
			if(h<0) {
				h = 23;
			}
			System.out.println(h+" "+m);
		}
	}
}
