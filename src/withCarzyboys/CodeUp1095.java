package withCarzyboys;

import java.util.Scanner;

public class CodeUp1095 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] students = new int[23];

        int result = 1;
        for(int i=0;i<n;i++){
            int num = scan.nextInt();
            if(i==0){
                result = num;
            } else {
                result = Math.min(result, num);
            }
        }
        System.out.println(result);
    }
}
