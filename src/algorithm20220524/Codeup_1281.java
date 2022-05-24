package algorithm20220524;

import java.util.Scanner;

public class Codeup_1281 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = 0;		
		for (int i=a;i<=b;i++) {
			if (i%2==0) {
				c = c-i;
				System.out.print("-"+i);
			}else {
				c = c+i;
				if(i==a) {
					System.out.print(i);
				}
				else {
					System.out.print("+"+i);
				}
			}
		}
		System.out.print("="+c);
	}

}
