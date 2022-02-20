//Q3. Write a program to consider saving & current account in the bank.
// Saving account holder has ‘Fixed Deposits’ whereas Current account holder has cash credit.
// Apply polymorphism to find out total cash in the bank.
//Description:-
//
//Write a program to claculate the total cash available in the bank. In this bank,bank will provide two types of accounts one is savings
// accounts and another is current account where current account has cash credits and savings account has fixed deposit options.

package com.compay;
import java.util.ArrayList;
class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {
        return totalDeposits-creditLimit;
    }
}
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {
        return totalDeposits+fixedDepositAmount;
    }
}
public class Assignment2Q3 {
    public static int totalCashInBank(ArrayList<Integer> cash){
        int sum=0,i;
        for (i=0;i<cash.size();i++) {
            sum += cash.get(i);
        }
        return sum;
    }
    public int getCash(){
        return 0;
    }
    public static void main(String[] args) {
        CurrentAccount currentAccountTotal = new CurrentAccount();
        SavingsAccount savingsAccountTotal = new SavingsAccount();
        ArrayList<Integer> cash = new ArrayList<>();
        cash.add(currentAccountTotal.getCash());
        cash.add(savingsAccountTotal.getCash());
        System.out.println(totalCashInBank(cash));
    }
}
