package algorithm20220519;

import java.util.Scanner;

public class Codeup_1067 {

	public static void main(String[] args) {
		// 코드업 기초3 1067번
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		
		if(a>=0) {
			System.out.println("plus");
			if(a%2==0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		} else {
			System.out.println("minus");
			if(a%2==0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		}
	}
}
