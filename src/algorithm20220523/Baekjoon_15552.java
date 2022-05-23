package algorithm20220523;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_15552 {
		public static void main(String[] args) throws IOException {
			//백준 3단계 4번
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int n = Integer.parseInt(br.readLine());
	        
			for(int i=0;i<n;i++) {
				String x = br.readLine();
				String[] y=new String[2];
				y= x.split(" ");
				int a = Integer.parseInt(y[0]);
				int b = Integer.parseInt(y[1]);
				bw.write(a+b+"\n");
			}
	        br.close();
			bw.flush();
	        bw.close();
		}	
	}
