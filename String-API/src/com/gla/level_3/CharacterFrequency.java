package com.gla.level_3;

import java.util.Scanner;

public class CharacterFrequency {
    public static String[][] calculateFrequency(String str) {
        int[] freq = new int[256];
        int len = str.length();


        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            freq[c]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = Character.toString((char) i); // character
                result[index][1] = Integer.toString(freq[i]);    // frequency
                index++;
            }
        }

        return result;
    }


    public static void displayFrequency(String[][] freqArray) {
        System.out.printf("%-10s %-10s%n", "Character", "Frequency");
        System.out.println("----------------------");
        for (String[] row : freqArray) {
            System.out.printf("%-10s %-10s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String[][] frequency = calculateFrequency(input);
        displayFrequency(frequency);

        sc.close();
    }
}
