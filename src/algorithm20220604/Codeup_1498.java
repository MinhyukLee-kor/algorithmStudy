package algorithm20220604;

import java.util.Scanner;

public class Codeup_1498 {

	public static void main(String[] args) {
		// 코드업 기초5-3 1498번

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int g = scan.nextInt();
		
		int[] arr = new int[n];

		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		
		for(int i=0;i<n;i=i+g) {	//****
			int min = arr[i];
			for(int j=i;j<i+g;j++) { 
				if(j<n) {//j=5.. 인덱스범위 초과
					if(min>arr[j]) {
						min = arr[j];
					}
				}
			}
			System.out.print(min+" ");
		}
		

	}

}
