package algorithm20220517;

import java.util.Scanner;

public class Codeup_1085 {

	public static void main(String[] args) {
		// 기초2 코드업 1085번
		Scanner scan = new Scanner(System.in);
		//..문제가 MB로만 표현
		double h = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double s = scan.nextDouble();
		
		double a = (h*b*c*s)/ 8 / 1024 / 1024;
		System.out.printf("%.1f MB",a);
		
		/*
		Scanner scan = new Scanner(System.in);
		
		double h = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double s = scan.nextDouble();
		double a = (h*b*c*s)/8;
		int count=0;
		
		while(true) {
			if(a >= 1024) {
				a = a/1024;
				count++;
			} else {
			break;
			}
		}
		double size = a;
		
		switch (count) {
		case 0: 
			System.out.printf("%.1f byte", size);
			break;
		case 1: 
			System.out.printf("%.1f KB", size);
			break;
		case 2: 
			System.out.printf("%.1f MB", size);
			break;
		case 3: 
			System.out.printf("%.1f GB", size);
			break;
		case 4: 
			System.out.printf("%.1f TB", size);
			break;
		}
		*/
	}
}
