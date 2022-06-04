package algorithm20220603;

import java.util.Scanner;

public class Codeup_1464 {

	public static void main(String[] args) {
		// 코드업 5-3 1464번
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int total = n*m;

		int[][] arr = new int[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=total;
				total--;
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
