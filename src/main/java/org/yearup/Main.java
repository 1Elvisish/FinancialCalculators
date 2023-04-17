package org.yearup;

import java.util.Scanner;

public class FinancialCalculators
{
    private static final int MONTHS_IN_A_YEAR = 12

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal amount");
        double principal = Scanner.nextDouble();

        System.out.println("Enter the interest rate");
        float annualInterestRate = Scanner.nextFloat();

        System.out.println("Enter the loan length");
        int loanLength = Scanner.nextInt();

        float monthlyInterestRate = annualInterestRate / MONTHS_IN_A_YEAR;
        int numberOfPayments = loanLength * MONTHS_IN_A_YEAR;

        double monthlyPayment =  principal * (monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, numberOfPayments))) /
                ((Math.pow(1 + monthlyInterestRate, numberOfPayments)) -1 );
        System.out.println("Monthlypayment + MonthlyPayment");



    }
}