package com.gla.Arrays;

import java.util.Scanner;

public class Football_team {
    public static void main (String[] args){
        Scanner Sc=new Scanner(System.in);
        double[]height =new double[11];
        double sum=0.0;
        System.out.println("enter the height of 11 players");
        for(int i=0;i<11;i++){
            System.out.println("height of player"+(i+1)+":");
            height[i]=Sc.nextDouble();
            sum += height[i];
        }
    double mean=sum/11;
        System.out.println(" Mean height of the football team = " + mean);

}
}
