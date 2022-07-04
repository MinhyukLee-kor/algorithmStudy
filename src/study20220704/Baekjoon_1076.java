package study20220704;

import java.util.Objects;
import java.util.Scanner;

public class Baekjoon_1076 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String color1 = scan.nextLine();
        String color2 = scan.nextLine();
        String color3 = scan.nextLine();

        String resist1 = "0";
        String resist2 = "0";
        long resist3 = 0;


        if(Objects.equals(color1, "black")){
            resist1 = "0";
        } else if (Objects.equals(color1, "brown")) {
            resist1 = "1";
        } else if (Objects.equals(color1, "red")) {
            resist1 = "2";
        } else if (Objects.equals(color1, "orange")) {
            resist1 = "3";
        } else if (Objects.equals(color1, "yellow")) {
            resist1 = "4";
        } else if (Objects.equals(color1, "green")) {
            resist1 = "5";
        } else if (Objects.equals(color1, "blue")) {
            resist1 = "6";
        } else if (Objects.equals(color1, "violet")) {
            resist1 = "7";
        } else if (Objects.equals(color1, "grey")) {
            resist1 = "8";
        } else if (Objects.equals(color1, "white")) {
            resist1 = "9";
        }

        if(Objects.equals(color2, "black")){
            resist2 = "0";
        } else if (Objects.equals(color2, "brown")) {
            resist2 = "1";
        } else if (Objects.equals(color2, "red")) {
            resist2 = "2";
        } else if (Objects.equals(color2, "orange")) {
            resist2 = "3";
        } else if (Objects.equals(color2, "yellow")) {
            resist2 = "4";
        } else if (Objects.equals(color2, "green")) {
            resist2 = "5";
        } else if (Objects.equals(color2, "blue")) {
            resist2 = "6";
        } else if (Objects.equals(color2, "violet")) {
            resist2 = "7";
        } else if (Objects.equals(color2, "grey")) {
            resist2 = "8";
        } else if (Objects.equals(color2, "white")) {
            resist2 = "9";
        }

        if(Objects.equals(color3, "black")){
            resist3 = 1;
        } else if (Objects.equals(color3, "brown")) {
            resist3 = 10;
        } else if (Objects.equals(color3, "red")) {
            resist3 = 100;
        } else if (Objects.equals(color3, "orange")) {
            resist3 = 1000;
        } else if (Objects.equals(color3, "yellow")) {
            resist3 = 10000;
        } else if (Objects.equals(color3, "green")) {
            resist3 = 100000;
        } else if (Objects.equals(color3, "blue")) {
            resist3 = 1000000;
        } else if (Objects.equals(color3, "violet")) {
            resist3 = 10000000;
        } else if (Objects.equals(color3, "grey")) {
            resist3 = 100000000;
        } else if (Objects.equals(color3, "white")) {
            resist3 = 1000000000;
        }

        System.out.print(Long.parseLong(resist1+resist2)*resist3);
    }
}
