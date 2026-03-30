package com.gla.Arrays;

import java.util.Scanner;

public class Multiple_value {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[]number =new double[10];
        double total=0.0;
        int index=0;

        while(true) {
            System.out.println("enter the number (0 or negative to stop)");
            double num = sc.nextDouble();
            if (num <= 0) {
                break;
            }
            if(index==10){
                System.out.println("the array is full(10 is maximum)");
                break;
            }
            number[index]=num;
            index++;
        }
        for(int i=0;i<index;i++){
            total+=number[i];

        }
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(number[i]);
        }
        System.out.println("Sum of all numbers = " + total);
    }
}

