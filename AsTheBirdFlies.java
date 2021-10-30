package me.khosraw;

import java.util.Scanner;

public class AsTheBirdFlies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double x = in.nextDouble();
        double y = in.nextDouble();

        int distance = (int)(Math.round(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2))));

        System.out.println(distance);
    }
}