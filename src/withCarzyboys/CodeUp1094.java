package withCarzyboys;

import java.util.Scanner;

public class CodeUp1094 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] students = new int[23];

        for(int i=0;i<n;i++){
            int num = scan.nextInt() - 1;
            students[num]++;
        }
        for (int i=0;i<23;i++) {
            System.out.print(students[i]+" ");
        }
    }
}
