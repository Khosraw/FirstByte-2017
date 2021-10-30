package me.khosraw;

import java.util.Scanner;

public class TidbitCipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String tidbit = in.nextLine();
        String encrypted = in.nextLine();

        StringBuilder decrypted = new StringBuilder(encrypted);

        for (int i = 0; i < decrypted.length()-tidbit.length(); i++) {
            if (decrypted.substring(i, i+tidbit.length()).equals(tidbit)) {
                decrypted.delete(i, i+tidbit.length());
                i = i - tidbit.length();
            }
        }

        System.out.println(decrypted);
    }
}