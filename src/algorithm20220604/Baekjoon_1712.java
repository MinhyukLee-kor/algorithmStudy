package algorithm20220604;

import java.util.Scanner;

public class Baekjoon_1712 {

	public static void main(String[] args) {
		// 백준 7-1 1712번
		Scanner scan = new Scanner(System.in);
		long A = scan.nextInt();
		long B = scan.nextInt();
		long C = scan.nextInt();
		if(C==B) {	//팔아도 이득이0
			System.out.println(-1);
		}
		else if(A/(C-B)<0) {	//팔수록 손해
			System.out.println(-1);
		} else {
			System.out.println(A/(C-B)+1);
		}

	}

}
