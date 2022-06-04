package algorithm20220603;

import java.util.Scanner;

public class Codeup_1024 {

	public static void main(String[] args) {
		// 코드업 기초5-2 1024번
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		
		char[] arr = new char[str.length()];
		
		for(int i=0;i<str.length();i++) {
			arr[i]=str.charAt(i);
			System.out.println("'"+arr[i]+"'");
		}
	}

}
