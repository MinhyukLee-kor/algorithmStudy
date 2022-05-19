package algorithm20220519;

import java.util.Scanner;

public class Codeup_1069 {

	public static void main(String[] args) {
		// 코드업 기초3 1069번
		Scanner scan = new Scanner(System.in);
		int x = scan.next().charAt(0);
		
		switch (x) {
		case 65:
			System.out.println("best!!!");
			break;
		case 66:
			System.out.println("good!!");
			break;	
		case 67:
			System.out.println("run!");
			break;
		case 68:
			System.out.println("slowly~");
			break;
		default:
			System.out.println("what?");
			break;
		}
	}
}
