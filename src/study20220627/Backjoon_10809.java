package study20220627;

import java.util.Scanner;

public class Backjoon_10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		// 단어 S 입력
		String S = scan.next();
		
		// 아마 indexOf 사용하면 될듯
		
		for(char i='a';i<='z';i++) {	// 처음엔 아스키코드로 변환해서 숫자로 해보려고하다가 char로 바로되나 해보니 됨.
			System.out.print(S.indexOf(i)+" ");
		}
		
		
	}

}
