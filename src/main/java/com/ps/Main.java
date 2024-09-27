package com.ps;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    static Scanner scanny = new Scanner(System.in);

    public static void main(String[] args) {
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
}