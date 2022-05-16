package algorithm20220516;

import java.util.Scanner;

public class Baekjoon_10430 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//백준 1단계 12번
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		int c;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		System.out.println((a+b)%c);
		System.out.println(((a%c)+(b%c))%c);
		System.out.println((a*b)%c);
		System.out.println((a%c)*(b%c)%c);
	}
}