package algorithm20220520;

import java.util.Scanner;

public class Codeup_1212 {

	public static void main(String[] args) {
		// 코드업 기초3 1212번
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int max = Math.max(Math.max(a, b), c);
		int total = a+b+c;
		if(max<total-max) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}
