package com.gla.method;

import java.util.Random;

public class FootballTeamHeights {
    static int sum(int[] arr) {
        int s = 0;
        for(int h : arr) s += h;
        return s;
    }


    static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }


    static int shortest(int[] arr) {
        int min = arr[0];
        for(int h : arr) if(h < min) min = h;
        return min;
    }


    static int tallest(int[] arr) {
        int max = arr[0];
        for(int h : arr) if(h > max) max = h;
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();

        for(int i = 0; i < heights.length; i++) {
            heights[i] = 150 + rand.nextInt(101); // 150 to 250
        }

        System.out.print("Player heights: ");
        for(int h : heights) System.out.print(h + " ");
        System.out.println();

        System.out.println("Shortest height: " + shortest(heights));
        System.out.println("Tallest height: " + tallest(heights));
        System.out.println("Mean height: " + mean(heights));
    }
}
