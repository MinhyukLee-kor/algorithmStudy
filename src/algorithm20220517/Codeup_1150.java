package algorithm20220517;

import java.util.Scanner;

public class Codeup_1150 {

	public static void main(String[] args) {
		// 코드업 기초2 1150번
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		int x = c>(a>b ? b:a) ? (a>b ? b:a):c;
		System.out.println(x);
	}

}
