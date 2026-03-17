package com.gla.method;

import java.util.Scanner;

public class HandShakes {
    static int calculateHandshakes(int n) {
        return n * (n - 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        int maxHandshakes = calculateHandshakes(numberOfStudents);
        System.out.println("Maximum handshakes: " + maxHandshakes);

        sc.close();
    }


    }

