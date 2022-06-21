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
			if(n%5==0) {	//5로 나뉘면 바로 봉지수 출력
				count = count + n/5;
				System.out.println(count);
				break;
			} else {	//5로 안나뉠경우 봉지수증가시키면서 3kg씩 감소
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
