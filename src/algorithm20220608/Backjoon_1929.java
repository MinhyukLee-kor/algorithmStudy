package algorithm20220608;

import java.util.Scanner;

public class Backjoon_1929 {
	
	//소수확인 메소드
	static boolean prime(int n) {
		if(n==2) {
			return true;
		}
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// 백준 8-4 1929번
		
		Scanner scan = new Scanner(System.in);
		
		int M = scan.nextInt();
		int N = scan.nextInt();
		
		for(int i=M;i<=N;i++) {
			if(i%2!=0) {
				if(prime(i)) {
					System.out.println(i);
				}
			}
		}
		
		
		//시간초과..
		
		//검색결과.. 에스토테네스의 체(?) 라는 방법을 사용하라고함..
		
		// 소수인거로 판명된 수가 나오면 그 수의 배수들을 전부 배제..
		// ex) 2가소수.. 4 6 8 10 12 14... 전부 배제
		// ex) 3이소수.. 6 9 12 15 18.. 전부 배제..
	}
}
