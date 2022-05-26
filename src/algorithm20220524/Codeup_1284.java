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
			if(prime(i)) {//소수면 나눠라
				if(n%i==0) {	//그수로 나눠지니? 나눠지면?
					if(prime(n/i)){ //몫이 소수니?
						a = i;
						b = n/i;
						break;
					}
				}
			}
		}
		if(a!=0) {//a가 0이아니면 소수(위에서 어떤 소수가 들어왔을테니)
			System.out.println(a+" "+b);
		}
		else System.out.println("wrong number");
	}
}
