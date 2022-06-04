package algorithm20220603;

import java.util.Scanner;

public class Codeup_1990 {

	public static void main(String[] args) {
		// 코드업 기초5-2 1990번
		Scanner scan = new Scanner(System.in);
		
		String number = scan.next();
		int sum = 0;
		
		char[] arr = new char[number.length()];
		
		for(int i=0;i<number.length();i++) {
			arr[i]=number.charAt(i);
			sum = sum + arr[i];
		}
		if(sum%3==0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		
	}

}
