package algorithm20220519;

import java.util.Scanner;

public class Codeup_1163 {

	public static void main(String[] args) {
		// 코드업 기초3 1163번
		Scanner scan = new Scanner(System.in);
		int y = scan.nextInt();
		int m = scan.nextInt();
		int d = scan.nextInt();
		
		int sum = y+m+d;
		if((sum/100)%2==0) {
			System.out.println("대박");
		} else {
			System.out.println("그럭저럭");
		}
	}

}
