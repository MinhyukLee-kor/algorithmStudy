package algorithm20220520;

import java.util.Scanner;

public class Codeup_1224 {

	public static void main(String[] args) {
		// 코드업 기초3 1224번
		Scanner scan = new Scanner(System.in);
		float a = scan.nextInt();
		float b = scan.nextInt();
		float c = scan.nextInt();
		float d = scan.nextInt();

		if(a/b>c/d) {
			System.out.println(">");
		} else if(a/b==c/d) {
			System.out.println("=");
		} else {
			System.out.println("<");
		}
	}

}
