package algorithm20220524;

import java.util.Scanner;

public class Codeup_1283 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double a = scan.nextInt();
		int b = scan.nextInt();
		double[] c = new double[b];

		for(int i=0;i<c.length;i++) {
			c[i] = scan.nextInt();
		}
		double income = a;
		for(int i=0;i<c.length;i++) {
			income = (income*(1+(c[i]/100)));
			
		}
		if(a<income) {
			System.out.println(Math.round(income-a));
			System.out.println("good");
		} else if(a>income) {
			System.out.println(Math.round(income-a));
			System.out.println("bad");
		} else {
			System.out.println("0");
			System.out.println("same");
		}
	}
}
