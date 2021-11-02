package me.khosraw;

import java.util.*;

public class PopsiclePurchase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int p = Integer.parseInt(in.nextLine());
        int ratio = 1;
        ArrayList<String> flavors = new ArrayList<>();
        HashMap<String, String> association = new HashMap<>();

        for (int i = 0; i < p; i++) {
            flavors.add(in.nextLine());
        }

        Collections.sort(flavors);

        try {
            for (int i = 0; i < flavors.size(); i++) {
                if (flavors.get(i).equals(flavors.get(i + 1))) {
                    ratio += 1;
                } else {
                    association.put(Integer.toString(ratio), flavors.get(i));
                    ratio = 1;
                }
            }
        } catch (IndexOutOfBoundsException nfe) {
            if (flavors.get(flavors.size()-1).equals(flavors.get(flavors.size()-2))) {
                association.put(Integer.toString(ratio), flavors.get(flavors.size()-1));
            } else {
                ratio = 1;
                association.put(Integer.toString(ratio), flavors.get(flavors.size()-1));
            }
        }

        for (String key : association.keySet()) {
            System.out.println(key + " " + association.get(key));
        }
    }
}
