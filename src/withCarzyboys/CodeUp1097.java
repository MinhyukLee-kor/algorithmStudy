package withCarzyboys;

import java.util.Scanner;

public class CodeUp1097 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] badook = new int[19][19];

        // 바둑판 입력
        for (int i=0;i<19;i++) {
            for(int j=0;j<19;j++){
                badook[i][j] = scan.nextInt();
            }
        }
        int n = scan.nextInt();
        for( int i=0;i<n;i++) {
            int x = scan.nextInt() - 1;
            int y = scan.nextInt() - 1;

            //십자뒤집기
            //가로
            for (int j=0;j<19;j++){
                badook[x][j] = badook[x][j] == 1 ? 0 : 1;
            }
            //세로
            for (int j=0;j<19;j++){
                badook[j][y] = badook[j][y] == 1 ? 0 : 1;
            }
        }

        //출력
        for(int i = 0; i < 19; i++){
            for(int j = 0; j < 19; j++){
                System.out.print(badook[i][j]+" ");
            }
            System.out.println();
        }
    }
}
