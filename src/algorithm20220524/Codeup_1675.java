package algorithm20220524;

import java.util.Scanner;

public class Codeup_1675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String x= scan.nextLine();
		char[] chr= new char[x.length()];
		
		//공백=32 a=97
		for(int i=0;i<x.length();i++) {
			chr[i] = x.charAt(i);
			if(chr[i]==32) {
				System.out.print(" ");
			} else if(chr[i]==97) {
				chr[i]='x';
				System.out.print(chr[i]);
			} else if(chr[i]==98) {
				chr[i]='y';
				System.out.print(chr[i]);
			} else if(chr[i]==99) {
				chr[i]='z';
				System.out.print(chr[i]);
			} else {
				chr[i]=(char)(chr[i]-3);
				System.out.print(chr[i]);
			}
		}

	}

}
