package algorithm20220530;

import java.util.Scanner;

public class Codeup_1409 {

	public static void main(String[] args) {
		//코드업 기초 5-1 1409번
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		for(int i=0;i<10;i++) {
			arr[i]=scan.nextInt();
		}
		int k = scan.nextInt();
		System.out.println(arr[k-1]);

	}

}
