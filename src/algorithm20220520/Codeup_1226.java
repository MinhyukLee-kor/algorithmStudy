package algorithm20220520;

import java.util.Scanner;

public class Codeup_1226 {

	public static void main(String[] args) {
		// 코드업 기초3 1226번

		Scanner scan = new Scanner(System.in);
		int count = 0;
		int count2 = 0;
		
		int[] lotto = new int[7];
		for(int i=0;i<7;i++) {
			lotto[i]=scan.nextInt();
		}
		
		int[] mylotto = new int[6];
		for(int i=0;i<6;i++) {
			mylotto[i]=scan.nextInt();
		}
		
		for(int i=0;i<6;i++) {
			for(int k=0;k<6;k++) {
				if(mylotto[i]==lotto[k]) {
					count++;
				}
			}
			if(mylotto[i]==lotto[6]) {
				count2++;
			}
		}
		switch (count) {
		case 0:
			System.out.println("0");
			break;
		case 1:
			System.out.println("0");
			break;
		case 2:
			System.out.println("0");
			break;
		case 3:
			System.out.println("5");
			break;
		case 4:
			System.out.println("4");
			break;
		case 5:
			if(count2==1) {
				System.out.println("2");
			} else {
			System.out.println("3");
			}
			break;
		case 6:
			System.out.println("1");
			break;
		}
	}

}
