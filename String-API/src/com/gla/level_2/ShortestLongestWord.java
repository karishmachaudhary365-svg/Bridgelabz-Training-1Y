package com.gla.level_2;

import java.util.Scanner;

public class ShortestLongestWord {
    static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }


    static String[] splitText(String text) {
        int words = 1;
        for (int i = 0; i < findLength(text); i++)
            if (text.charAt(i) == ' ') words++;

        String[] arr = new String[words];
        String temp = "";
        int j = 0;

        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) != ' ')
                temp += text.charAt(i);
            else {
                arr[j++] = temp;
                temp = "";
            }
        }
        arr[j] = temp;
        return arr;
    }


    static String[][] wordLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    static String[] shortestLongest(String[][] data) {
        int min = Integer.parseInt(data[0][1]);
        int max = Integer.parseInt(data[0][1]);
        String sWord = data[0][0];
        String lWord = data[0][0];

        for (int i = 1; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);
            if (len < min) { min = len; sWord = data[i][0]; }
            if (len > max) { max = len; lWord = data[i][0]; }
        }
        return new String[]{sWord, lWord};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] data = wordLength(words);
        String[] result = shortestLongest(data);

        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
    }
}
