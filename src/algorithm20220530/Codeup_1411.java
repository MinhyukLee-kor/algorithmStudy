package algorithm20220530;

import java.util.Scanner;

public class Codeup_1411 {

	public static void main(String[] args) {
		// 코드업 기초5-1 1411번
		Scanner scan =new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] arr = new int[N];
		int sum =0;
		int input = 0;
		
		for(int i=1;i<=N;i++) {
			sum = sum +i;
		}
		
		for(int i=0;i<N-1;i++) {
			input = scan.nextInt();
			sum = sum - input;
		}
		System.out.println(sum);
		
	}

}
