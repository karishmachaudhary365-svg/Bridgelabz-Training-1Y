package com.gla.Arrays;

import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in );
        System.out.print("Enter a number: ");
        int number = Sc.nextInt();
        int result[]=new int[10];

       for(int i=1;i<=10;i++) {
         result [i-1]= number*i;
       }
           System.out.println("Multiplication Table of " + number + ":");
          for(int i=1;i<=10;i++){
              System.out.println(number + " * " + i + " = " + result[i-1]+" ");
          }
    }
}
