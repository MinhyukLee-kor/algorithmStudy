package algorithm20220603;

import java.util.Scanner;

public class Codeup_1099 {

	public static void main(String[] args) {
		// 코드업 기초5-3 1099번
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[10][10];
		
		// 배열 생성
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		//개미위치..
		int a= 1;
		int b= 1;

		int check =0;


		for(int i=a;i<10;i++) {
			if(check==0) {	
			for(int j=b;j<10;j++) {
					if(arr[i][j]==0) {
						arr[i][j]=9;
						b++;
					} else if (arr[i][j] ==1) {
						a++;
						b--;
						break;
					} else if (arr[i][j] ==2) {
						arr[i][j] = 9;
						//여기서 어떻게 완전 끝내지...?
						check=1;
						break;
					}
				}
			}
			}

		
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
