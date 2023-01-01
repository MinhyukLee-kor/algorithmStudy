package withCarzyboys;

import java.util.Scanner;

public class CodeUp1096 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] badook = new int[19][19];

        for(int i=0;i<n;i++){
            int x = scan.nextInt() - 1;
            int y = scan.nextInt() - 1;
            badook[x][y] = 1;
        }

        for(int i=0;i<badook.length;i++) {
            for(int j = 0; j< badook.length; j++) {
                System.out.print(badook[i][j]+" ");
            }
            System.out.println();
        }
    }
}
