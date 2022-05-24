package algorithm20220524;

import java.util.Scanner;

public class Codeup_1284 {

	static boolean prime(int n) {
		if(n==2) {
			return true;
		}
		for (int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = 0;
		int b = 0;
		
		for(int i=2;i<n;i++) {
			if(prime(i)) {
				if(n%i==0) {
					if(prime(n/i)){
						a = i;
						b = n/i;
						break;
					}
				}
			}
		}
		if(a >= 2) {
			System.out.println(a+" "+b);
		}
		else System.out.println("wrong number");
	}
}
