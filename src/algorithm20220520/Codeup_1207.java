package algorithm20220520;

import java.util.Scanner;

public class Codeup_1207 {

	public static void main(String[] args) {
		// 코드업 기초 1207번
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		int total = a+b+c+d;
		
		switch (total) {
		case 0:
			System.out.println("모");
			break;
		case 1:
			System.out.println("도");
			break;
		case 2:
			System.out.println("개");
			break;
		case 3:
			System.out.println("걸");
			break;
		case 4:
			System.out.println("윷");	
			break;
		}
	}

}
