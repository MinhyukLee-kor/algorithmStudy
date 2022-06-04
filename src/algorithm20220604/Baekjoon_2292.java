package algorithm20220604;

import java.util.Scanner;

public class Baekjoon_2292 {

	public static void main(String[] args) {
		// 백준 7-2 2292번
		Scanner scan = new Scanner(System.in);
		// 벌집 6배수로 증가	6 12 18 24..
		// 1 - 1
		// 2~7 -2
		// 8~19 - 3
		int sum = 2;
		int count = 1;
		// sum + 6*count
		// sum +6
		
		int number = scan.nextInt();
		
		if(number==1) {
			System.out.print(1);
		} else {
			while(number>=sum) {
				sum = sum + count*6;
				count++;
			}
			System.out.print(count);
		}


	}

}
