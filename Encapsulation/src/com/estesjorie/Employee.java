package com.estesjorie;

public class Employee {
    public int baseSalary;
    public int hourlyRate;

    public int calcWage(int extraHours){
        return baseSalary + (extraHours * hourlyRate);
    }
}
