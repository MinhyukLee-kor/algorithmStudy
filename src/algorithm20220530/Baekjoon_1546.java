package algorithm20220530;

import java.util.Scanner;

public class Baekjoon_1546 {

	public static void main(String[] args) {
		// 백준4단계 5번
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int A[]= new int[N];
		for(int i=0;i<N;i++) {
			A[i] = scan.nextInt();
		}
		double max = A[0];
		for(int i=0;i<N-1;i++) {
			if(max<A[i+1]) {
				max = A[i+1];
			}
		}
		double sum = 0;
		for(int i=0;i<N;i++) {
			sum = sum + A[i];
		}
		double ave = sum/max*100/N;
		System.out.println(ave);
		scan.close();

	}

}
