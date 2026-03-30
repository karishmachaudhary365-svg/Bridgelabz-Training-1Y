package com.gla.Arrays;
import java.util.Scanner;

public class Multidimentional {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr2[][]={{1,2,3},{4,5,6},{7,8,9}};
        int row= arr2.length;
        int col= arr2[2].length;
        int [][] matrix =new int[row ][ col];
        for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
               System.out.print(arr2[i][j]+" ");

           }
           System.out.println();
        }
        int arr[]=new int[row*col];
        int index = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[index] = matrix[i][j];
                arr[index++]=arr2[i][j];

            }
        }
        System.out.println("Elements copied into 1D array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
