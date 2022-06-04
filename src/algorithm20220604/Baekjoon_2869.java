package algorithm20220604;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon_2869 {

	public static void main(String[] args) throws IOException {
		// 백준7-4 2869번
		
		/*
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int V = scan.nextInt();
        scan.close();
		int day = (V-B) / (A-B);
        if((V-B)%(A-B)!=0){
            day = day + 1;
        }
		System.out.println(day);
		*/
		//시간초과..
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		int day = (V-B) / (A-B);
        if((V-B)%(A-B)!=0){
            day = day + 1;
        }
		System.out.println(day);
	}

}
