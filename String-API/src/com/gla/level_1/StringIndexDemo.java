package com.gla.level_1;

import java.util.Scanner;

public class StringIndexDemo {
    static void generateException(String text) {
        System.out.println(text.charAt(text.length())); // invalid index
    }

    // Method to handle exception
    static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception generated");
        }

        handleException(text);
    }
}
