package com.gla.method;

import java.util.Arrays;

public class NumberChecker {
    public static int countDigits(int n) { return String.valueOf(Math.abs(n)).length(); }

    public static int[] digitsArray(int n) {
        String s = String.valueOf(Math.abs(n));
        int[] arr = new int[s.length()];
        for(int i=0;i<s.length();i++) arr[i]=s.charAt(i)-'0';
        return arr;
    }

    public static boolean isDuckNumber(int[] arr) { for(int d:arr) if(d!=0) return true; return false; }

    public static boolean isArmstrong(int[] arr) {
        int n=arr.length, sum=0, orig=0;
        for(int d:arr) sum += Math.pow(d,n);
        for(int d:arr) orig=orig*10+d;
        return sum==orig;
    }

    public static int[] largestTwo(int[] arr) {
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
        for(int d:arr){ if(d>max1){max2=max1;max1=d;} else if(d>max2&&d!=max1) max2=d;}
        return new int[]{max1,max2};
    }

    public static int[] smallestTwo(int[] arr) {
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        for(int d:arr){ if(d<min1){min2=min1;min1=d;} else if(d<min2&&d!=min1) min2=d;}
        return new int[]{min1,min2};
    }

    public static void main(String[] args) {
        int number = 153;
        int[] digits = digitsArray(number);
        System.out.println("Digits: "+Arrays.toString(digits));
        System.out.println("Count: "+countDigits(number));
        System.out.println("Duck?: "+isDuckNumber(digits));
        System.out.println("Armstrong?: "+isArmstrong(digits));
        System.out.println("Largest 2: "+ Arrays.toString(largestTwo(digits)));
        System.out.println("Smallest 2: "+Arrays.toString(smallestTwo(digits)));
    }
}
