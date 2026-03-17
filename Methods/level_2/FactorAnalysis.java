package com.gla.method;

import java.util.Scanner;

public class FactorAnalysis{
    static int[] findFactors(int num) {
        int count = 0;
        for(int i = 1; i <= num; i++)
            if(num % i == 0) count++;

        int[] factors = new int[count];
        int index = 0;
        for(int i = 1; i <= num; i++)
            if(num % i == 0) factors[index++] = i;

        return factors;
    }


    static int sumFactors(int[] arr) {
        int sum = 0;
        for(int n : arr) sum += n;
        return sum;
    }


    static long productFactors(int[] arr) {
        long product = 1;
        for(int n : arr) product *= n;
        return product;
    }


    static int sumSquareFactors(int[] arr) {
        int sumSq = 0;
        for(int n : arr) sumSq += Math.pow(n, 2);
        return sumSq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);
        System.out.print("Factors: ");
        for(int f : factors) System.out.print(f + " ");
        System.out.println();

        System.out.println("Sum of factors: " + sumFactors(factors));
        System.out.println("Product of factors: " + productFactors(factors));
        System.out.println("Sum of squares of factors: " + sumSquareFactors(factors));

        sc.close();
    }
}
