package com.estesjorie;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int principal = 0;
        byte years = 0;
        float annualRate = 0;

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
            annualRate = scanner.nextFloat();
            if (annualRate >= 1 && annualRate <= 30) {
                break;
            }
            System.out.println("Enter a valid value between 1 and 30!");
        }

        while(true) {
            System.out.println("Years: ");
            years = scanner.nextByte();
            if (years>=1 && years <=30) {
                break;
            }
            System.out.println("Enter a valid value between 1 and 30!");
        }
        double mortgage = calcMortgage(principal, annualRate, years);
        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormat);
    }

    public static double calcMortgage(double principal, float annualRate, byte years){
        final byte PERCENT = 100;
        final byte MONTHS_IN_YEAR = 12;
        short numOfPayments = (short)(years * MONTHS_IN_YEAR);
        float monthlyRate = annualRate / PERCENT / MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyRate * Math.pow(1 + monthlyRate, numOfPayments))
                / (Math.pow(1 + monthlyRate, numOfPayments) - 1);

        return mortgage;
    }
}
