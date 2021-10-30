package me.khosraw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DiamondSelection {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> diamonds = new ArrayList<>();
        ArrayList<String> goodDiamonds = new ArrayList<>();
        String diamond;

        for (int i = 0; i < 20; i++) {
            diamond  = in.nextLine();
            if (diamond.equals("0")) break;
            else diamonds.add(diamond);
        }

        for (String s : diamonds) {
            if (s.contains("F") || s.contains("VS")) {
                goodDiamonds.add(s);
            }
        }

        Collections.sort(goodDiamonds);

        System.out.println(goodDiamonds.get(goodDiamonds.size()-1));

    }
}