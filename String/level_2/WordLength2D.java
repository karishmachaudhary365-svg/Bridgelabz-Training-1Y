package com.gla.level_2;

import java.util.Scanner;

public class WordLength2D {
    static int findLength(String s) {
        int c = 0;
        try {
            while (true) {
                s.charAt(c);
                c++;
            }
        } catch (Exception e) {
            return c;
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] data = wordLength(words);

        System.out.println("Word\tLength");
        for (int i = 0; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);
            System.out.println(data[i][0] + "\t" + len);
        }
    }
}
