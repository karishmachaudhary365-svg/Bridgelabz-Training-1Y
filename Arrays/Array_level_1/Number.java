package com.gla.Arrays;

import java.util.Scanner;

public class Number {
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter natural number");
        int number= Sc.nextInt();

        if(number<=0){
            System.out.println("the number is not a natural number");
            Sc.close();
            return;
        }
        int size=number /2+1;
        int[] oddnumbers=new int [size];
        int[] evenNumbers=new int [size];


        int oddIndex=0;
        int evenIndex=0;

        for(int i=0;i<=number;i++){
            if (i %2==0){
                evenNumbers [evenIndex]=i;
                evenIndex++;

            }
            else{
                oddnumbers[oddIndex]=i;
                oddIndex++;

            }
        }
        System.out.println("odd number");
        for(int i=0;i<oddIndex;i++){
            System.out.println(+oddnumbers[i]+":");
        }
        System.out.println("even nuber");
        for(int i=0;i<evenIndex;i++){
            System.out.println(+evenNumbers[i]+":");
        }
    }
}



