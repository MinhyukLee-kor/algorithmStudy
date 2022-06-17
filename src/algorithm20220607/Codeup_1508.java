package algorithm20220607;

import java.util.Scanner;

public class Codeup_1508 {

	public static void main(String[] args) {
		// 코드업 5-3 1508번
		
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[][] arr = new int[size][size];
		
		for(int i=0;i<size;i++) {
			arr[i][0]=scan.nextInt();
			for(int j=1;j<=i;j++) {
				arr[i][j]= (arr[i][j-1])-(arr[i-1][j-1]);
			}
		}
		//출력
		for(int i=0;i<size;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
