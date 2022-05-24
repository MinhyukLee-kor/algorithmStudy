package algorithm20220524;

import java.util.Scanner;

public class Baekjoon_1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int numb = N;
		int k = 0;
		while(true) {
		int a = numb/10;
		int b = numb%10;
		int numb2 = (a+b)%10;
		int c = 10*b+numb2;
		numb = c;
		k = k +1 ;
			if(numb==N) {
				break;
			}
		}
		System.out.println(k);
		scan.close();
	}

}
