package com.gla.level_2;

import java.util.Scanner;

public class SplitTextDemo {
    static String[] splitText(String text) {
        int words = 1;
        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) == ' ')
                words++;

        String[] arr = new String[words];
        String temp = "";
        int j = 0;

        for (int i = 0; i < text.length(); i++) {
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

    static boolean compare(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i])) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] arr1 = splitText(text);
        String[] arr2 = text.split(" ");

        System.out.println("Same result: " + compare(arr1, arr2));
    }
}
