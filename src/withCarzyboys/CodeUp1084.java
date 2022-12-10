package withCarzyboys;

import java.io.*;

public class CodeUp1084 {
    public static void main(String[] args) throws IOException {
        //Scanner사용시 시간 초과 -> BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // " " 붙히면 풀이가 안됨..
        String[] arr = br.readLine().split(" ");
        int count=0;
        for(int i = 0; i < Integer.valueOf(arr[0]); i++){
            for(int j = 0; j < Integer.valueOf(arr[1]); j++){
                for(int k = 0; k < Integer.valueOf(arr[2]); k++){
                    bw.write(i+" "+j+" "+k+"\n");
                    count++;
                }
            }
        }
        bw.flush();
        System.out.println(count);
    }
}
