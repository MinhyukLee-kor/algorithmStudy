package algorithm20220519;

import java.util.Scanner;

public class Codeup_1168 {

	public static void main(String[] args) {
		// 코드업 기초3 1168번
		Scanner scan = new Scanner(System.in);
		String birth = scan.next();
		int gender = scan.nextInt();
		
		int y = Integer.parseInt(birth.substring(0, 2));
		int age;
		if(gender==1||gender==2) {
			age = 112 - y + 1;
			System.out.println(age);
		} else {
			age = 12 - y + 1;
			System.out.println(age);
		}
	}

}
