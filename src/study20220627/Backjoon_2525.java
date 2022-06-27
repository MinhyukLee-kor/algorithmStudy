package study20220627;

import java.util.Scanner;

public class Backjoon_2525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// 오븐에 넣는 시간
		int h = scan.nextInt();	//시
		int m = scan.nextInt();	//분
		// 조리 시간
		int count = scan.nextInt();
		
		// 현재 시간에 조리시간을 더한다
		// 분으로만 먼저 계산
		m = m + count;
		
		//60분초과분은 시간으로 치환
		while(m>=60) {
			h = h+1;
			m = m-60;
		}
		
		//24시는 00시로.. 25시는 1시..
		if(h>=24) {
			h = h-24;
		}
		
		// 출력
		System.out.print(h+" "+m);
	}

}
