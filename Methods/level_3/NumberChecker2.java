package com.gla.method;

import java.util.Arrays;

public class NumberChecker2 {
    public static int countDigits(int n) { return String.valueOf(Math.abs(n)).length(); }


    public static int[] digitsArray(int n) {
        String s = String.valueOf(Math.abs(n));
        int[] arr = new int[s.length()];
        for(int i=0;i<s.length();i++) arr[i]=s.charAt(i)-'0';
        return arr;
    }


    public static int sumDigits(int[] arr) {
        int sum=0; for(int d:arr) sum+=d; return sum;
    }

  
    public static int sumSquares(int[] arr) {
        int sum=0; for(int d:arr) sum+=Math.pow(d,2); return sum;
    }


    public static boolean isHarshad(int n, int[] arr) {
        return n % sumDigits(arr) == 0;
    }


    public static int[][] digitFrequency(int[] arr) {
        int[][] freq = new int[10][2];
        for(int i=0;i<10;i++) freq[i][0]=i;
        for(int d:arr) freq[d][1]++;
        return freq;
    }

    public static void main(String[] args) {
        int number = 21;
        int[] digits = digitsArray(number);

        System.out.println("Digits: "+ Arrays.toString(digits));
        System.out.println("Count: "+countDigits(number));
        System.out.println("Sum of digits: "+sumDigits(digits));
        System.out.println("Sum of squares: "+sumSquares(digits));
        System.out.println("Harshad?: "+isHarshad(number,digits));

        System.out.println("Digit frequencies:");
        for(int[] f:digitFrequency(digits)) if(f[1]>0)
            System.out.println("Digit "+f[0]+" appears "+f[1]+" times");
    }
}
