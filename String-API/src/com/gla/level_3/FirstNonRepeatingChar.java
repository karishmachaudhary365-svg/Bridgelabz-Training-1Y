package com.gla.level_3;

import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static char findFirstNonRepeating(String str) {
        int[] freq = new int[256];
        int len = str.length();

        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            freq[c]++;
        }


        for (int i = 0; i < len; i++) {
            if (freq[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }


        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        char firstUnique = findFirstNonRepeating(input);

        if (firstUnique != '\0') {
            System.out.println("The first non-repeating character is: " + firstUnique);
        } else {
            System.out.println("No non-repeating character found in the string.");
        }

        sc.close();
    }
}
