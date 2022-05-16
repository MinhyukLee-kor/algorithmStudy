package algorithm20220516;

import java.util.Scanner;

public class Baekjoon_2588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 백준 1단계 13번
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		a = scan.nextInt();
		b = scan.nextInt();
		System.out.println(a*(b%10));
		System.out.println(a*((b%100)/10));
		System.out.println(a*(b/100));
		System.out.println(a*b);
		
	}

}
