package algorithm20220523;

import java.util.Scanner;

public class Codeup_1076 {

	public static void main(String[] args) {
		// 코드업 4-1 1076번
		Scanner scan = new Scanner(System.in);
		
		char x = scan.nextLine().charAt(0);
		
		for(char i='a';i<x+1;i++) {
			System.out.print(i+" ");
		}
		scan.close();
	}

}
