package algorithm20220520;

import java.util.Scanner;

public class Codeup_1218 {

	public static void main(String[] args) {
		// 코드업 기초3 1218번

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(c<a+b) {
			if(a==b && b==c) {
				System.out.println("정삼각형");
			} else if(a==b || b==c || a==c) {
				System.out.println("이등변삼각형");
			} else if(a*a+b*b==c*c) {
				System.out.println("직각삼각형");
			} else {
				System.out.println("삼각형");
			}
		} else {
			System.out.println("삼각형아님");
		}
	}

}
