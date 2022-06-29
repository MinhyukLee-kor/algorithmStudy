package study20220629;

import java.util.Scanner;

public class Baekjoon_10162 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int A = 0;	//5분 300초
		int B = 0;	//1분 60초
		int C=  0;	//10초
		
		//요리시간 T
		int T = scan.nextInt();
		
		//성능을 위해? 1의자리가 0이아니면 어차피 딱 안됨..
		if(T%10!=0) {
			System.out.println(-1);
		} else {
			//요리시간이 0이나 음수가될때까지..
			while(T>0) {
				if(T>=300) {
					T = T-300;
					A++;
				} else if(T>=60) {
					T = T-60;
					B++;
				} else if(T>=10) {
					T = T-10;
					C++;
				}
			}
			System.out.println(A+" "+B+" "+C);
		}
		
	}

}
