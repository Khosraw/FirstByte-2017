package me.khosraw;

import java.util.Scanner;

public class MammothMovieHouseAttendance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = Integer.parseInt(in.nextLine());
        String nums;
        String nums2;
        int total = 0;

        for (int i = 0; i < t; i++) {
            nums = in.nextLine();
            nums2 = nums.substring(2);

            for (String num : nums2.split(" ")) {
                total += Integer.parseInt(num);
            }
        }
        System.out.println("Mammoth Movie House had " + total + " attendees today.");
    }
}