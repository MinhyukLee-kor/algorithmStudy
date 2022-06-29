package study20220629;

import java.util.Scanner;

public class Baekjoon_1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String S = scan.next();
		//대문자로 변경
		S = S.toUpperCase();
		//알파벳갯수 크기의 배열생성
		int[] count = new int[26];
		int number =0;
			
		//단어길이만큼반복
		for(int j=0;j<S.length();j++) {
			//아스키코드..관련.. count[0]이 A의 갯수가 되도록..
			number = S.charAt(j)-'A';
			count[number]++;
		}
		
		//제일 많이 나온 알파벳 구하기
		int max=0;
		
		char answer= '?';
		
		//배열 크기만큼 반복
		for(int i=0;i<26;i++) {
			if(max<count[i]) {	//현재 최댓값보다 해당 배열의 값이크면 max값 변환
				max = count[i];
				answer = (char)(i+'A'); //'A' 는 65기도함으로 A대신 65써도될듯
				
			} else if(max == count[i]) {	//최댓값과 같은수가 있으면 '?' 출력
				answer = '?';
			}
		}
		
		//출력
		System.out.println(answer);
	}

}
