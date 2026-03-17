package com.gla.level_3;

import java.util.Scanner;

public class FrequencyUsingUniqueChars {
    public static char[] uniqueCharacters(String str) {
        int len = str.length();
        char[] temp = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;


            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }


        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }

        return result;
    }


    public static String[][] characterFrequency(String str) {
        int[] freq = new int[256]; // ASCII array to store frequency


        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }


        char[] uniqueChars = uniqueCharacters(str);


        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = Character.toString(uniqueChars[i]);
            result[i][1] = Integer.toString(freq[uniqueChars[i]]);
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

        String[][] frequency = characterFrequency(input);
        displayFrequency(frequency);

        sc.close();
    }
}
