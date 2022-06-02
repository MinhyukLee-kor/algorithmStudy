package algorithm20220530;

import java.util.Scanner;

public class Codeup_1430 {

	public static void main(String[] args) {
		// 코드업 기초5-1 1430번
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=scan.nextInt();
		}
		
		int M = scan.nextInt();
		int[] Qarr = new int[M];
		for(int i=0;i<M;i++) {
			Qarr[i] = scan.nextInt();
		}
		
		int count = 0;
		for(int j=0;j<M;j++) {
			count = 0;
			for(int i=0;i<N;i++) {
				if(Qarr[j]==arr[i]) {
					count++;
				}
			}
			if(count!=0) {
				System.out.print("1 ");
			} else {
				System.out.print("0 ");
			}
		}
		//시간초과..
	}
}
