package com.compay;

import java.util.Scanner;

public class Assignment1Q3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double principalAmount = scanner.nextDouble();
        int time = scanner.nextInt();
        double interestRate = scanner.nextDouble();
        scanner.close();
        System.out.println(Sici.simpleInterest(principalAmount, time, interestRate));
        System.out.println(Sici.compoundInterest(principalAmount, time, interestRate));
    }
}
