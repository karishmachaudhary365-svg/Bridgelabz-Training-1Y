package com.gla.Arrays;

import java.util.Scanner;

public class Even_odd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number[] = new int[5];
        int i;
        for (i = 0; i < 5; i++) {
            System.out.println("enter number" + (i + 1) + ":");
            number[i] = sc.nextInt();
            if (number[i] > 0) {
                System.out.println("the" + number[i] + " is positive");
                if (number[i] % 2 == 0) {
                    System.out.println("the " + number[i] + " is even");
                } else {
                    System.out.println("the " + number[i] + " is odd");
                }
            } else if (number[i] < 0) {
                System.out.println("the " + number[i] + " is negative");
            } else {
                System.out.println("the" + number[i] + " is zero");
            }
        }

            int first = number[0];
            int last = number[4];
            if (first == last) {
                System.out.println("the number is equal");
            } else if (first < last) {
                System.out.println("the number  is less");

            } else {
                System.out.println("the number  is greater");
            }

    }
}