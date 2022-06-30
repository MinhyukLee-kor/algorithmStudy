package study20220630;

import java.util.Scanner;

public class Baekjoon_2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		// 두수 입력
		String A = scan.next();
		String B = scan.next();
		
		// temp 초기화
		String temp ="";
		
		// String + String ㅋㅋ
		for(int i=2;i>=0;i--) {
			temp = temp + A.charAt(i);
		}
		A = temp;
		
		temp="";
		
		for(int i=2;i>=0;i--) {
			temp = temp + B.charAt(i);
		}
		B = temp;
		
		int number1 = Integer.parseInt(A);
		int number2 = Integer.parseInt(B);
		
		System.out.println(Math.max(number1, number2));
	}

}
