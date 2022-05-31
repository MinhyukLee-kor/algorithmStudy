package algorithm20220530;

import java.util.Scanner;

public class Baekjoon_8958 {

	public static void main(String[] args) {
		// 백준 4단계 6번
		Scanner scan = new Scanner(System.in);
		String arr[] = new String[scan.nextInt()];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.next();
		}
		
		scan.close();
		
		
		for(int i=0;i<arr.length;i++) {
			int a = 0;
			int sum = 0;
			for(int j=0;j<arr[i].length();j++) {
				if(arr[i].charAt(j)=='O') {
					a = a + 1;
				} else {
					a = 0;
				}
				sum = sum + a;
			}
			System.out.println(sum);
		}

	}

}
