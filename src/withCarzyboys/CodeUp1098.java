package withCarzyboys;

import java.util.Scanner;

public class CodeUp1098 {
    // 왜 또 에러???
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int w = scan.nextInt();
        int n = scan.nextInt();

        int[][] array = new int[h][w];
        for(int i = 0; i < n; i++){
            int l = scan.nextInt();
            int d = scan.nextInt();
            int x = scan.nextInt() - 1;
            int y = scan.nextInt() - 1;

            // 가로
            if(d==0) {
                for (int j = 0; j < l; j++) {
                    array[x][y] = 1;
                    y = y + 1;
                }
            } else {
                //세로
                for (int j = 0; j < l; j++) {
                    array[x][y] = 1;
                    x = x + 1;
                }
            }
        }

        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
