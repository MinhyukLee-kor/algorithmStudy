package algorithm20220603;

import java.util.Scanner;

public class Baekjoon_1316 {

	public static void main(String[] args) {
		// 백준 6-10 1316번
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int count=n;
		
		for(int i=0;i<n;i++) {
			String str = scan.next();
			int[] arr = new int[26];	//a~z.. arr[0] ->a..
			
				for(int j=0;j<str.length();j++) {
					if(arr[str.charAt(j)-97]==0) {	//'a'==97
						arr[str.charAt(j)-97]++;
					} else if(str.charAt(j)!=str.charAt(j-1)) {	// 0이아님.. + 전 문자랑 같지도않음
						count--;	//아니면 빼는식으로 계산
						break;
					}
				}
		}
		System.out.println(count);	
	}

}
