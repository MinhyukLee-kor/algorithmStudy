package algorithm20220524;

import java.util.Scanner;

public class Baekjoon_2439 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int space = N-1;
		
		for(int k=0;k<N;k++) {
			for(int i=0;i<space;i++) {
				System.out.print(" ");
			}
			for(int j=0;j<k+1;j++) {
			System.out.print("*");
			}
			System.out.println();
			space= space - 1 ;
		}
		scan.close();
	}

}
