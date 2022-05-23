package algorithm20220523;

import java.util.Scanner;

public class Baekjoon_11021 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i=0;i<T;i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			System.out.printf("Case #%d: %d%n",i+1, A+B);
		}
		scan.close();
	}

}
