package com.ps;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    static Scanner scanny = new Scanner(System.in);

    public static void MortgageCalculator() {
        int principal;
        double interest, monthly_payment, months, years;
        double total_interest, monthly_rate;
        System.out.println("Enter your Principal amount: ");
        principal = scanny.nextInt();
        System.out.println("Enter your interest rate: ");
        interest = scanny.nextDouble();
        System.out.println("How many years is it? ");
        years = scanny.nextInt();
        months = years*12;
        monthly_rate = interest/12;
        monthly_payment = principal * (monthly_rate * Math.pow(1 + monthly_rate, months)) / (Math.pow((1 +monthly_rate),months) -1 );
        System.out.println(monthly_payment);
    }
    public static void FutureValue(){
        float deposit, interest, number_of_years;
        float futureValue, totalInterest;
        System.out.println("Enter the deposit: ");
        deposit = scanny.nextFloat();
        System.out.println("Enter the interest rate: ");
        interest = scanny.nextFloat();
        System.out.println("Enter the number of years: ");
        number_of_years = scanny.nextFloat();
        totalInterest = (deposit * interest) * number_of_years;
        futureValue = deposit + totalInterest;
        System.out.println("future value is: " + futureValue + ", And total interest rate: "+ totalInterest);
    }
    public static void PresentValue() {
        float monthly_payout, interest_rate, years, present_value;
        System.out.println("Enter the monthly_payout: ");
        monthly_payout = scanny.nextFloat();
        System.out.println("Enter the interest rate: ");
        interest_rate = scanny.nextFloat();
        System.out.println("Enter the number of years: ");
        years = scanny.nextFloat();
        float monthlyInterestRate = interest_rate / 12;
        float totalPayments = years * 12;
        //present_value = (float) (monthly_payout * (1 - Math.pow(1 + interest_rate, -totalPayments)) / monthlyInterestRate);
        present_value = (float) (monthly_payout * (1 - Math.pow(1 + monthlyInterestRate, -totalPayments)) / monthlyInterestRate);
        System.out.println(present_value);
    }
    public static void main(String[] args) {
        PresentValue();
    }
}
