package algorithm20220523;

import java.util.Scanner;

public class Codeup_1090 {

	public static void main(String[] args) {
		// 코드업4-1 1090번
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int r = scan.nextInt();
		int n = scan.nextInt();
		long answer=a;
		for(int i=1;i<n;i++) {
			answer = answer*r;
		}
		System.out.println(answer);
		scan.close();
	}

}
