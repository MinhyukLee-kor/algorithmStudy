package algorithm20220516;

import java.util.Scanner;

public class Codeup_1020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 코드업 기초2 1020번
		Scanner scan = new Scanner(System.in);
		String x = scan.next();
		String[] array = x.split("-");
		int a = Integer.parseInt(array[0]);
		int b = Integer.parseInt(array[1]);

		System.out.printf("%06d%07d",a,b);
	}
}
