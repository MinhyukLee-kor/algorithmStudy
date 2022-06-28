package study20220628;

import java.util.Scanner;

public class Baekjoon_1075 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int F = scan.nextInt();
		
		//뒷자리 00 으로 바꾸기
		long number = (N/100)*100;
		
		int answer = 0;
		
		//00~99까지 계산하면서 나누기.. while문으로해도될듯..
		for(int i=0;i<100;i++) {
			if((number+i)%F==0) {
				answer = i;
				break;
			}
		}
		System.out.printf("%02d",answer);

	}

}
