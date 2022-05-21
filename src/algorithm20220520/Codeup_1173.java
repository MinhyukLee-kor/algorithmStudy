package algorithm20220520;

import java.util.Scanner;

public class Codeup_1173 {

	public static void main(String[] args) {
		// 코드업 기초3 1173번
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int m = scan.nextInt();

		if(m>=30) {
			m = m-30;
			System.out.println(h+" "+m);
		} else {
			if(h==0) {
				h=24;
			}
			h = h-1;
			m = m+30; //60+m-30
			System.out.println(h+" "+m);
		}
	}

}
