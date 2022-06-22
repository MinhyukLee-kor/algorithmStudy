package algorithm20220608;

import java.util.Scanner;

public class Codeup_1524 {

	public static void main(String[] args) {
		// 코드업 기초5-3 1524번
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[9][9];
			//찾아보니 [11][11] 로만들어서 테두리를 강제로 만들면 하드코딩안해도됨..
			// [11][11] 크기로 만들면 모든 선택점에서 8개의 방향을 모두 계산하면됨..
			// 테두리는 기본값인 0이라 지뢰의 갯수에 영향을 안줌
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		int r = scan.nextInt()-1;
		int c = scan.nextInt()-1;
		int count = 0;
		
		
		if(arr[r][c]==1) {
			System.out.println("-1");
		} else if(r==0&&c==0){	//모서리
			if(arr[r][c+1]==1) {//3시방향
				count++;
			}
			if(arr[r+1][c+1]==1) {//5시방향
				count++;
			}
			if(arr[r+1][c]==1) {//6시방향
				count++;
			}
			System.out.println(count);
		} else if(r==8&&c==8) {	//모서리
			if(arr[r][c-1]==1) {//9시방향
				count++;
			}
			if(arr[r-1][c-1]==1) {//11시방향
				count++;
			}
			if(arr[r-1][c]==1) {//12시방향
				count++;
			}
			System.out.println(count);
		} else if(r==0&&c==8) {	//모서리
			if(arr[r+1][c]==1) {//6시방향
				count++;
			}
			if(arr[r+1][c-1]==1) {//7시방향
				count++;
			}
			if(arr[r][c-1]==1) {//9시방향
				count++;
			}
			System.out.println(count);
		} else if(r==8&&c==0) {	//모서리
			if(arr[r-1][c]==1) {//12시방향
				count++;
			}
			if(arr[r-1][c+1]==1) {//1시방향
				count++;
			}
			if(arr[r][c+1]==1) {//3시방향
				count++;
			}
			System.out.println(count);
		} else if(r==0) {
			if(arr[r][c+1]==1) {//3시방향
				count++;
			}
			if(arr[r+1][c+1]==1) {//5시방향
				count++;
			}
			if(arr[r+1][c]==1) {//6시방향
				count++;
			}
			if(arr[r+1][c-1]==1) {//7시방향
				count++;
			}
			if(arr[r][c-1]==1) {//9시방향
				count++;
			}
			System.out.println(count);
		} else if(c==0) {
			if(arr[r-1][c]==1) {//12시방향
				count++;
			}
			if(arr[r-1][c+1]==1) {//1시방향
				count++;
			}
			if(arr[r][c+1]==1) {//3시방향
				count++;
			}
			if(arr[r+1][c+1]==1) {//5시방향
				count++;
			}
			if(arr[r+1][c]==1) {//6시방향
				count++;
			}
			System.out.println(count);
		} else if(r==8) {
			if(arr[r][c-1]==1) {//9시방향
				count++;
			}
			if(arr[r-1][c-1]==1) {//11시방향
				count++;
			}
			if(arr[r-1][c]==1) {//12시방향
				count++;
			}
			if(arr[r-1][c+1]==1) {//1시방향
				count++;
			}
			if(arr[r][c+1]==1) {//3시방향
				count++;
			}
			System.out.println(count);
		} else if(c==8) {
			if(arr[r+1][c]==1) {//6시방향
				count++;
			}
			if(arr[r+1][c-1]==1) {//7시방향
				count++;
			}
			if(arr[r][c-1]==1) {//9시방향
				count++;
			}
			if(arr[r-1][c-1]==1) {//11시방향
				count++;
			}
			if(arr[r-1][c]==1) {//12시방향
				count++;
			}
			System.out.println(count);
		} else {
			if(arr[r-1][c]==1) {//12시방향
				count++;
			}
			if(arr[r-1][c+1]==1) {//1시방향
				count++;
			}
			if(arr[r][c+1]==1) {//3시방향
				count++;
			}
			if(arr[r+1][c+1]==1) {//5시방향
				count++;
			}
			if(arr[r+1][c]==1) {//6시방향
				count++;
			}
			if(arr[r+1][c-1]==1) {//7시방향
				count++;
			}
			if(arr[r][c-1]==1) {//9시방향
				count++;
			}
			if(arr[r-1][c-1]==1) {//11시방향
				count++;
			}
			System.out.println(count);
		}
	}

}
