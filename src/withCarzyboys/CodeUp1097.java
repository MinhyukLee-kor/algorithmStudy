package withCarzyboys;

import java.util.Scanner;

public class CodeUp1097 {

    //제출하면 틀림.. 왜??
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] badook = new int[19][19];

        // 바둑판 입력
        for (int i=0;i<badook.length;i++) {
            for(int j=0;j<badook.length;j++){
                badook[i][j] = scan.nextInt();
            }
        }

        for( int i=0;i<n;i++) {
            int x = scan.nextInt() - 1;
            int y = scan.nextInt() - 1;

            //십자뒤집기
            //가로
            for (int j=0;j<badook.length;j++){
                badook[x][j] = badook[x][j] == 1 ? 0 : 1;
            }
            //세로
            for (int j=0;j<badook.length;j++){
                badook[j][y] = badook[j][y] == 1 ? 0 : 1;
            }
        }

        //출력
        for(int i = 0; i < badook.length; i++){
            for(int j = 0; j < badook.length; j++){
                System.out.print(badook[i][j]+" ");
            }
            System.out.println();
        }
    }
}
