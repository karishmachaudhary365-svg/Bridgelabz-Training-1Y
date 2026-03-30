package com.gla.Arrays;


import java.util.Scanner;

public class Student_Age {
    public static void main (String args[]){
        Scanner Sc = new Scanner(System.in );
        int arr[]=new int[10];
        int i;
        for( i =1;i<=10;i++) {
            System.out.println("enter the age of " + i + ":");
        }
            int age= Sc.nextInt();
        if(age>=18){
            System.out.println("student"+i+"is eligible for vote ");
        }
        else {
            System.out.println("student"+i+"is not eligible for vote ");
        }

    }
}
