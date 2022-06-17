package algorithm20220607;

import java.util.Scanner;

public class Baekjoon_2839 {

	public static void main(String[] args) {
		// 백준7-7
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		//5kg,3kg 설탕으로 최대한 적은봉지로 배달..
		int count = 0;
		
		while(true) {
			if(n%5==0) {
				count = count + n/5;
				System.out.println(count);
				break;
			} else {
				n = n-3;
				count++;
			}
			if(n<0) {
				System.out.println("-1");
				break;
			}
			
		}
	}

}
