package com.gla.level_2;

import java.util.Scanner;

public class StringLengthDemo {
    static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        int len1 = findLength(text);     // user-defined
        int len2 = text.length();        // built-in

        System.out.println("Length (without length()): " + len1);
        System.out.println("Length (using length()): " + len2);
    }
}
