package com.gla.Arrays;

import java.util.Scanner;

public class Multiplication_table_6to9 {
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter a number between 6 and 9: ");
        int number = Sc.nextInt();
        if(number<=6 || number >=9){
            System.out.println("please enter a number between 6 and 9");
            Sc.close();
            return;
        }
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
