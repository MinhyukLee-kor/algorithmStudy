package algorithm20220516;

import java.util.Scanner;

public class Codeup_1019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 코드업 기초2 1019번
		Scanner scan = new Scanner(System.in);
		String x = scan.next();
		String[] array = x.split("\\.");	// 그냥 . 은 정규식 표현으로 임의의 한문자를 의미하기 때문에 \\를 붙혀줘야 (.)닷 으로 인식
		int a = Integer.parseInt(array[0]);
		int b = Integer.parseInt(array[1]);	
		int c = Integer.parseInt(array[2]);
		
		System.out.printf("%04d.%02d.%02d", a,b,c);		//%02d 2칸을 사용해 출력 , %04d 안할경우 99년이 0099로안나옴
		
		//체감 난이도 : 5
	}
}
