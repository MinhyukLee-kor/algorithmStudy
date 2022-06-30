package study20220630;

import java.util.Scanner;

public class Baekjoon_14697 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//방정보
		int room1 = scan.nextInt();
		int room2 = scan.nextInt();
		int room3 = scan.nextInt();
		//학생인원수
		int stuNum = scan.nextInt();
		
		int answer = 0;
		for(int i=0;i<=300;i++) {
			for(int j=0;j<=300;j++) {
				for(int k=0;k<=300;k++) {
					//노가다..?
					if((room1*i)+(room2*j)+(room3*k)==stuNum) {
						answer = 1;
					}
				}
			}
		}
		System.out.println(answer);
	}
}
