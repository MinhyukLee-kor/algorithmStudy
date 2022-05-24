package algorithm20220524;

import java.util.Scanner;

public class Codeup_1261 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String[] a = scan.nextLine().split(" ");
		int b = 0;
		for (int i=0;i<10;i++) {
			b = Integer.parseInt(a[i]);
			if (b % 5 == 0) {
				System.out.println(b);
				break;
			}			
		}
		if(b%5 != 0) {
			System.out.println(0);
		}
	}

}
