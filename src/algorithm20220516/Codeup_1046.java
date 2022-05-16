package algorithm20220516;

import java.util.Scanner;

public class Codeup_1046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 코드업 기초2 1046번
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println(a+b+c);
		float f = (float) ((a+b+c)/(3.0));
		System.out.printf("%.1f",f);
		// 체감 난이도 : 3
	}
}
