package algorithm20220523;

import java.util.Scanner;

public class Codeup_1255 {

	public static void main(String[] args) {
		// 코드업 4-1 1255번
		Scanner scan = new Scanner(System.in);
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		
		while(a<=b) {
			System.out.printf("%.2f ",a);
			a = a+ 0.01;
		}
	}

}
