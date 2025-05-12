package com.estesjorie;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        int principal = 0;
        int numOfPayments = 0;
        float monthlyRate = 0;

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a valid value between 1000 and 1,000,000!");
        }

        while(true) {
            System.out.println("Annual Rate (Interest): ");
            float annualRate = scanner.nextFloat();
            if (annualRate >= 1 && annualRate <= 30) {
                monthlyRate = annualRate / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a valid value between 1 and 30!");
        }

        while(true) {
            System.out.println("Years: ");
            byte years = scanner.nextByte();
            if (years>=1 && year <=30) {
                numOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a valid value between 1 and 30!");
        }

        double mortgage = principal
                * (monthlyRate * Math.pow(1 + monthlyRate, numOfPayments))
                / (Math.pow(1 + monthlyRate, numOfPayments) - 1);

        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormat);
    }
}
