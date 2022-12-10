package withCarzyboys;

import java.util.Scanner;

public class CodeUp1066 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr =   new int[3];
        arr[0] = scan.nextInt();
        arr[1] = scan.nextInt();
        arr[2] = scan.nextInt();
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] % 2 == 0 ? "even" : "odd");
        }
    }
}
