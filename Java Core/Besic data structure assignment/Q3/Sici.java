package com.compay;

public class Sici {
    public static double simpleInterest(double principalAmount,int time,double interestRate){
        double SimpleIntrest = (principalAmount*(interestRate)*(time))/100;
        return SimpleIntrest;
    }
    public static double compoundInterest(double principalAmount,int time,double interestRate){
        double CompundInterest = (principalAmount*(Math.pow(1+(interestRate/100),(time)))-principalAmount);
        return CompundInterest;
    }
}
