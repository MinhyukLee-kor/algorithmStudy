package algorithm20220517;

import java.util.Scanner;

public class Baekjoon_2753 {

	public static void main(String[] args) {
		// 백준 2단계 3번
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
			if(a%400==0||(a%4==0&&a%100!=0)) {
				System.out.println(1);
			}
				else{
					System.out.println(0);
				}	
	}
}
