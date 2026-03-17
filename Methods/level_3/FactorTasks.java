package com.gla.method;

import java.util.Arrays;

public class FactorTasks {
    public static int[] findFactors(int n) {
        int count=0;
        for(int i=1;i<=n;i++) if(n%i==0) count++;
        int[] factors = new int[count];
        int index=0;
        for(int i=1;i<=n;i++) if(n%i==0) factors[index++]=i;
        return factors;
    }


    public static int greatestFactor(int[] arr) { return arr[arr.length-1]; }

    public static int sumFactors(int[] arr) {
        int sum=0; for(int f:arr) sum+=f; return sum;
    }

    public static long productFactors(int[] arr) {
        long prod=1; for(int f:arr) prod*=f; return prod;
    }


    public static long productCubes(int[] arr) {
        long prod=1;
        for(int f:arr) prod*=Math.pow(f,3);
        return prod;
    }

    public static void main(String[] args) {
        int number=12;
        int[] factors=findFactors(number);

        System.out.println("Factors: "+ Arrays.toString(factors));
        System.out.println("Greatest factor: "+greatestFactor(factors));
        System.out.println("Sum of factors: "+sumFactors(factors));
        System.out.println("Product of factors: "+productFactors(factors));
        System.out.println("Product of cubes of factors: "+productCubes(factors));
    }
}
