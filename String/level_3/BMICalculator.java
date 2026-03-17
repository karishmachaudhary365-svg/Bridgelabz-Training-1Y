package com.gla.level_3;

import java.util.Scanner;

public class BMICalculator {
    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);
        String status;

        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            status = "Normal";
        } else if (bmi >= 25 && bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }


        return new String[]{String.format("%.2f", bmi), status};
    }


    public static String[][] processBMI(double[][] data) {
        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            String[] bmiInfo = calculateBMI(weight, height);

            result[i][0] = String.valueOf(weight);
            result[i][1] = String.valueOf(height);
            result[i][2] = bmiInfo[0];   // BMI
            result[i][3] = bmiInfo[1];   // Status
        }

        return result;
    }

    // Method to display the 2D String array in tabular format
    public static void displayResult(String[][] data) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        System.out.println("---------------------------------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] personData = new double[10][2];


        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) for person " + (i + 1) + ":");
            personData[i][0] = sc.nextDouble();

            System.out.println("Enter height (cm) for person " + (i + 1) + ":");
            personData[i][1] = sc.nextDouble();
        }

        String[][] bmiResults = processBMI(personData);


        displayResult(bmiResults);

        sc.close();
    }
}
