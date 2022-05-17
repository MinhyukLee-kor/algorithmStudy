package algorithm20220517;

import java.util.Scanner;

public class Baekjoon_14681 {

	public static void main(String[] args) {
		// 백준 2단계 4번
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(a>0&&b>0) {
			System.out.println(1);
		}
		else if(a<0&&b>0) {
			System.out.println(2);
		}
		else if(a<0&&b<0) {
			System.out.println(3);
		}
		else if(a>0&&b<0) {
			System.out.println(4);
		}
			scan.close();

	}

}
