package com.gla.method;

import java.util.Scanner;

public class SumNaturalNumbers {
    static int sumRecursive(int n) {
        if (n == 1) return 1;
        return n + sumRecursive(n - 1);
    }

    static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number!");
            sc.close();
            return;
        }

        int sumRec = sumRecursive(n);
        int sumFor = sumFormula(n);

        System.out.println("Sum using recursion: " + sumRec);
        System.out.println("Sum using formula: " + sumFor);

        if(sumRec == sumFor) System.out.println("Both methods give the same result.");
        else System.out.println("Mismatch in results!");

        sc.close();
    }
}
