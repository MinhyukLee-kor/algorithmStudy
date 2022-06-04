package algorithm20220603;

import java.util.Scanner;

public class Baekjoon_1152 {

	public static void main(String[] args) {
		// 백준 6-6 1152번
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		int count = 0;

		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)== ' ') {
				count++;
			}
		}
		// 띄어쓰기 +1 이 단어갯수 count+1
		if(str.charAt(0) != ' ' && str.charAt(str.length()-1) != ' ') {
			count = count +1;
		}
		// 띄어쓰기 +1  에서 앞뒤 공백 2개빼기 (띄어쓰기 +1) -2 count-1
		if(str.charAt(0) == ' ' && str.charAt(str.length()-1) == ' ') {
			count = count -1;
		}
		System.out.println(count);
	}

}
