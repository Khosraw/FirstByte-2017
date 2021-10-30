package me.khosraw;

import java.util.Scanner;

public class BunniesAbound {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int max = in.nextInt();
        int min;

        min = (23 % max == 0) ? (23/max) : (23/max+1);

        System.out.println(min);
    }
}
