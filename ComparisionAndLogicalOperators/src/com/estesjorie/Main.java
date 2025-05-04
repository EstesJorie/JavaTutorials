package com.estesjorie;

public class Main {
    public static void main(String[] args){
        int x = 1;
        int y = 1;
        System.out.println(x == y);

        int temp = 22;
        boolean isWarm = temp > 20 && temp < 30; //AND operator
        System.out.println(isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord; //OR and NOT operators
        System.out.println(isEligible);
    }
}
