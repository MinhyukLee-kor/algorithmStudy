package study20220629;

import java.util.Scanner;

public class Baekjoon_18108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		//1998년생이 태국에서는 2541년생..
		//2541-1998 = 543
		
		//불도연도를 서기연도로 변환 출력
		int year = scan.nextInt();
		System.out.println(year-543);
	}

}
