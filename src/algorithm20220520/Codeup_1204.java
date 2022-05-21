package algorithm20220520;

import java.util.Scanner;

public class Codeup_1204 {

	public static void main(String[] args) {
		// 코드업 기초3 1204번
		Scanner scan = new Scanner(System.in);
		int a= scan.nextInt();
		
		if(a==11) {
			System.out.println("11th");
		} else if(a==12) {
			System.out.println("12th");
		} else if(a==13) {
			System.out.println("13th");
		} else if(a%10==1){
			System.out.println(a+"st");
		} else if(a%10==2) {
			System.out.println(a+"nd");
		} else if (a%10==3) {
			System.out.println(a+"rd");
		} else {
			System.out.println(a+"th");
		}
	}

}
