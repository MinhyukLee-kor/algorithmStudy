package algorithm20220530;

import java.util.Arrays;
import java.util.Scanner;

public class Codeup_1425 {

	public static void main(String[] args) {
		// 코드업 기초5-1 1425번
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int C = scan.nextInt();
		int[] arr = new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);	// arr.sort() 해보다가 안되서 구글링
		
		for(int i=0;i<N;i++) {
			System.out.print(arr[i]+" ");
			if((i+1)==C) {
				System.out.println();
			}
		}
	}
	//표현오류로 제출은 오류 ㅡㅡ

}
