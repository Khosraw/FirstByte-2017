package me.khosraw;

import java.util.*;

public class PopsiclePurchase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int p = Integer.parseInt(in.nextLine());
        int ratio = 1;
        ArrayList<String> flavors = new ArrayList<>();
        ArrayList<String> association = new ArrayList<>();
        ArrayList<String> output = new ArrayList<>();

        for (int i = 0; i < p; i++) {
            flavors.add(in.nextLine());
        }

        Collections.sort(flavors);

        try {
            for (int i = 0; i < flavors.size(); i++) {
                if (flavors.get(i).equals(flavors.get(i + 1))) {
                    ratio += 1;
                } else {
                    association.add(Integer.toString(ratio));
                    association.add(flavors.get(i));
                    ratio = 1;
                }
            }
        } catch (IndexOutOfBoundsException nfe) {
            if (!flavors.get(flavors.size() - 1).equals(flavors.get(flavors.size() - 2))) {
                ratio = 1;
            }
            association.add(Integer.toString(ratio));
            association.add(flavors.get(flavors.size()-1));
        }

        for (int j = association.size()-1; j > 0; j--) {
            output.add(association.get(j-1) + " " + association.get(j));
            j--;
        }

        Collections.reverse(output);

        for (String s : output) {
            System.out.println(s);
        }
    }
}