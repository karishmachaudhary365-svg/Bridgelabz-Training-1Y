package com.gla.Arrays;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int number= Sc.nextInt();
        int maxfactor=10;
        int []factors=new int[maxfactor];
        int index=0;
        for(int i=1;i<=number;i++){
            if(number % i==0){
               if(index==maxfactor){
                   maxfactor *=2;
                   int temp[]=new int[maxfactor];
                   for (int j = 0; j < factors.length; j++) {
                       temp[j] = factors[j];
                   }
               factors=temp;
               }
                factors[index] = i;
                index++;

            }
        }
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }


    }
}
