package algorithm20220530;

import java.util.Scanner;

public class Codeup_1094 {

	public static void main(String[] args) {
		// 코드업 기초5-1 1094번
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		int temp = 0;
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		
		for(int i=0;i<n/2;i++) {
			temp = arr[n-1-i];
			arr[n-1-i]=arr[i];
			arr[i]=temp;
		}

		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
