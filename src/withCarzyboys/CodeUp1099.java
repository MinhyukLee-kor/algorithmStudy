package withCarzyboys;

import java.util.Scanner;

public class CodeUp1099 {
    // 왜 또 에러???
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] box = new int[10][10];
        //상자 정보 입력
        for(int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++) {
                box[i][j] = scan.nextInt();
            }
        }
        //개미 위치
        int x = 1;
        int y = 1;

        boolean flag = true;
        //움직임 시작
        for(int i=x;i<10;i++){
            if(flag) {
                for (int j = y; j < 10; j++) {
                    if (box[i][j] == 0) {
                        box[i][j] = 9;
                        y++;
                    } else if (box[i][j] == 1) {
                        x++;
                        y--;
                        break;
                    } else if (box[i][j] == 2) {
                        box[i][j] = 9;
                        flag = false;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        for(int i=0;i<10;i++){
            for(int j = 0; j<10; j++){
                System.out.print(box[i][j]+" ");
            }
            System.out.println();
        }
    }
}
