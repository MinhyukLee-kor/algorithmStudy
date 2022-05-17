package algorithm20220517;

import java.util.Scanner;

public class Codeup_1051 {
	
	public static void main(String[] args) {
		// 코드업 기초2 1051번
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(b>=a) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
