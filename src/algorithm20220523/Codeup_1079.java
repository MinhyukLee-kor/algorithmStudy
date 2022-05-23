package algorithm20220523;

import java.util.Scanner;

public class Codeup_1079 {

	public static void main(String[] args) {
		// 코드업 4-1 1079번
		Scanner scan = new Scanner(System.in);
		String x = scan.nextLine();
		
		String y[] = x.split(" ");
		
		for(int i=0;i<y.length;i++) {
			System.out.println(y[i]);
			
			if(y[i].equals("q")) {	//y[i]=="q"는 안됨..
				break;
			}
		}
		scan.close();
	}

}
