package com.gla.method;

import java.util.Scanner;

public class Rounds {
    static int calculateRounds(double side1, double side2, double side3, double distanceMeters) {
        double perimeter = side1 + side2 + side3;
        return (int) Math.ceil(distanceMeters / perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three sides of the triangular park (in meters): ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        int rounds = calculateRounds(a, b, c, 5000);
        System.out.println("Number of rounds to complete 5 km: " + rounds);

        sc.close();
    }
}
