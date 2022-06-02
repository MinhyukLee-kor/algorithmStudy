package algorithm20220530;

import java.util.Scanner;

public class Codeup_1369 {

	public static void main(String[] args) {
		// 코드업 4-2 1369번

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		for (int i=1;i<=n;i++) {	//행
			for (int j=1;j<=n;j++) {	//열
				if(i==1||i==n||j==1||j==n) {
					System.out.print("*");
				}else if(k == 1) {	//예외
					System.out.print("*");
				}

				 else if((i+j) % k == 1) {	//나머지이용 반복	i+j 가 중요.
					System.out.print("*");
				}else System.out.print(" ");
			}
			System.out.println();
		}

	}

}
