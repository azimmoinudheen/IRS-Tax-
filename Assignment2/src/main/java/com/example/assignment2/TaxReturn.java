package com.example.assignment2;

public class TaxReturn {
    private double income;
    private double deduction;
    private double taxAmount;

    public TaxReturn(double income, double deduction) {
        this.income = income;
        this.deduction = deduction;
        calculateTax();
    }

    public void calculateTax() {
        taxAmount = TaxCalculator.calculateTax(income, deduction);
    }

    public double getTaxAmount() {
        return taxAmount;
    }
}
