package me.khosraw;

import java.util.HashMap;
import java.util.Scanner;

public class MakingMoneyAtMotherLode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float rate = Float.parseFloat(in.nextLine());

        HashMap<Integer, Integer> working = new HashMap<>();

        working.put(1, in.nextInt());
        working.put(2, in.nextInt());
        working.put(3, in.nextInt());
        working.put(4, in.nextInt());
        working.put(5, in.nextInt());
        working.put(6, in.nextInt());

        float total = (working.get(6) != 0) ? 20 : 0;

        int hours = working.get(1)+working.get(2)+working.get(3)+working.get(4)+working.get(5)+working.get(6);

        int overHours = hours-40;

        total += overHours * (rate*2);

        total += (hours-overHours) * rate;

        System.out.println(total);
    }
}