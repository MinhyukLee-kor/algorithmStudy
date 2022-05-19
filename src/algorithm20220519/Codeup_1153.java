package algorithm20220519;

import java.util.Scanner;

public class Codeup_1153 {

	public static void main(String[] args) {
		// 코드업 기초3 1153번
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(a>b) {
			System.out.println(">");
		} else if(a<b) {
			System.out.println("<");
		} else {
			System.out.println("=");
		}
	}

}
