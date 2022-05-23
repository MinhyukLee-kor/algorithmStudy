package algorithm20220523;

import java.util.Scanner;

public class Codeup_1253 {

	public static void main(String[] args) {
		// 코드업 4-1 1253번
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = Math.max(a, b);
		int d = Math.min(a, b);
		for(int i=d;i<c+1;i++) {
			System.out.print(i+" ");
		}
		scan.close();
	}

}
