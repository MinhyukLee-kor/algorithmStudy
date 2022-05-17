package algorithm20220517;

import java.util.Scanner;

public class Codeup_1116 {

	public static void main(String[] args) {
		// 코드업 기초2 1116번
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();

		System.out.printf("%d+%d=%d\n",a,b,a+b);
		System.out.printf("%d-%d=%d\n",a,b,a-b);
		System.out.printf("%d*%d=%d\n",a,b,a*b);
		System.out.printf("%d/%d=%d\n",a,b,a/b);
	}

}
