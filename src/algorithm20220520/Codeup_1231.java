package algorithm20220520;

import java.util.Scanner;

public class Codeup_1231 {

	public static void main(String[] args) {
		// 코드업 기초3 1231번
		
		Scanner scan = new Scanner(System.in);
		
		String x = scan.next();
		String[] plus = x.split("\\+");
		String[] minus = x.split("-");
		String[] multi = x.split("\\*");
		String[] div = x.split("\\/");
		int a=0;
		int b=0;
		float c=0;
		float d=0;
		String status = "";
		
		if(plus.length!=1) {
			status = "plus";
			a =Integer.parseInt(plus[0]);
			b =Integer.parseInt(plus[1]);
		}else if(minus.length!=1) {
			status = "minus";
			a =Integer.parseInt(minus[0]);
			b =Integer.parseInt(minus[1]);
		}else if(multi.length!=1) {
			status = "multi";
			a =Integer.parseInt(multi[0]);
			b =Integer.parseInt(multi[1]);
		}else if(div.length!=1) {
			status = "div";
			c =Float.parseFloat(div[0]);
			d =Float.parseFloat(div[1]);
		}
		
		switch (status) {
		case "plus":
			System.out.println(a+b);
			break;
		case "minus":
			System.out.println(a-b);
			break;
		case "multi":
			System.out.println(a*b);
			break;
		case "div":
			System.out.printf("%.2f",c/d);
			break;

		}
	}

}
