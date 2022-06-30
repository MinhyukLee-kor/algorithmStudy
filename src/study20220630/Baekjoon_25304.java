package study20220630;

import java.util.Scanner;

public class Baekjoon_25304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		//총금액
		int cost = scan.nextInt();
		//물건 종류
		int count = scan.nextInt();
		
		//가격 계산
		int sum = 0;
		
		for(int i=0;i<count;i++) {
			// 물건가격
			int A = scan.nextInt();
			// 물건 갯수
			int B = scan.nextInt();
			// 누적
			sum = sum + A*B;
		}
		
		if(sum==cost) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
