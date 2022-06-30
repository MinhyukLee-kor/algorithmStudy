package study20220630;

import java.util.Scanner;

public class Baekjoon_11720 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// N개의 숫자입력
		int N = scan.nextInt();
		
		// 문자열로 받기
		String A = scan.next();
		
		//답 선언및 초기화
		int answer = 0;
		
		for(int i=0;i<N;i++) {
			int B = A.charAt(i)-48;	// 혹은 -'0'   0이 아스키코드로 48..
			answer = answer + B;
		}
		System.out.println(answer);
		
		//String 을 char로 그리고 다시 int 바꾸는게 핵심인듯
	}

}
