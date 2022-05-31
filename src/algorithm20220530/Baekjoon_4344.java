package algorithm20220530;

import java.util.Scanner;

public class Baekjoon_4344 {

	public static void main(String[] args) {
		// 백준 4단계 7번
		Scanner scan = new Scanner(System.in);
		int C = scan.nextInt();
		
		for(int i=0;i<C;i++) {
			int N = scan.nextInt();
			int[] point = new int[N];
			int sum = 0;
			int count = 0;
			for(int j=0;j<N;j++) {
				point[j] = scan.nextInt();
				sum = sum + point[j];
			}
			double ave = sum/N;
			for(int j=0;j<N;j++) {	
				if(point[j]>ave) {
					count = count + 1;
				}
			}
			double answer = (count*1.00)/(N*1.00)*100;
			System.out.print(String.format("%.3f", answer));
			System.out.println("%");
		}
		scan.close();

	}

}
