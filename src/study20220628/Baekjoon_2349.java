package study20220628;

import java.util.Scanner;

public class Baekjoon_2349 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		//공백..
		int space = N-1;
		
		for(int k=0;k<N;k++) {
			//공백 입력..
			for(int i=0;i<space;i++) {
				System.out.print(" ");
			}
			
			//*입력..
			for(int j=0;j<k+1;j++) {
			System.out.print("*");
			}
			
			//줄바꾸기
			System.out.println();
			
			//다음줄은 공백 1개 줄고 * 1개늘어남
			space= space - 1 ;
		}


	}

}
