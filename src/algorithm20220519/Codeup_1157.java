package algorithm20220519;

import java.util.Scanner;

public class Codeup_1157 {
	
	public static void main(String[] args) {
		// 코드업 기초3 1157번
		Scanner scan = new Scanner(System.in);
		float a = scan.nextFloat();
		if(a>=50&&a<=60) {
			System.out.println("win");
		}else {
			System.out.println("lose");
		}
	}
}
