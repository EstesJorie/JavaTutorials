package com.estesjorie;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Principal: ");
        int principal = scanner.nextInt();

        System.out.println("Annual Rate (Interest): ");
        float annualRate = scanner.nextFloat();
        float monthlyRate = annualRate / PERCENT / MONTHS_IN_YEAR;

        System.out.println("Years: ");
        byte years = scanner.nextByte();
        int numOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyRate * Math.pow(1 + monthlyRate, numOfPayments))
                / (Math.pow(1 + monthlyRate, numOfPayments) - 1);

        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormat);
    }
}
