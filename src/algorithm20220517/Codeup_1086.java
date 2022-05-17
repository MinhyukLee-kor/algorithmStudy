package algorithm20220517;

import java.util.Scanner;

public class Codeup_1086 {

	public static void main(String[] args) {
		// 코드업 기초2 1086번
		Scanner scan = new Scanner(System.in);
		
		double w = scan.nextInt();
		double h = scan.nextInt();
		double b = scan.nextInt();
		
		double x = w*h*b / 8 / 1024 / 1024 ;
		System.out.printf("%.2f MB", x);

	}

}
