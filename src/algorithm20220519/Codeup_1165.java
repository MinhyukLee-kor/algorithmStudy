package algorithm20220519;

import java.util.Scanner;

public class Codeup_1165 {

	public static void main(String[] args) {
		// 코드업 기초3 1165번
		Scanner scan = new Scanner(System.in);
		int time = scan.nextInt();
		int point = scan.nextInt();
		
		while(time<90) {
			point++;
			time= time+5;
		}
		System.out.println(point);
	}

}
