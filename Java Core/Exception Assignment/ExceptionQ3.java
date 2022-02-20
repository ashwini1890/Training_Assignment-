/**
 * Write an application to perform withdraw functionality on a SavingAccount object. Point to
 note:
 a. Raise InsufficientBalanceException if you are trying to withdraw more than balance
 or when you balance is zero. E.g. if you balance is 2000 and if you are trying to
 withdraw 2100 or if you balance is 0 and you are trying to withdraw positive value.
 b. Raise IllegalBankTransactionException if you are trying to withdraw a negative value
 from your balance. E.g. if you try to withdraw a negative value savingAcc.withdraw(-
 1000);
 Note: SavingAccount
 |-- long id
 |-- double balance
 |--double withdraw(double amount)
 |--double deposit(double amount)
 */
package com.compay;
import java.util.Scanner;

class Account {
    static long id;
    static double balance;
    public Account(long id, double balance) {
        Account.id = id;
        Account.balance = balance;
    }
    public static double withDraw(double Amount) {
        return balance-Amount;
    }
    @SuppressWarnings("unused")
    private static double deposit(double Amount) {
        return balance+Amount;
    }

}
@SuppressWarnings("serial")
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}
@SuppressWarnings("serial")
class IllegalBankTransactionException extends Exception{
    public IllegalBankTransactionException(String msg) {
        super(msg);
    }
}
public class ExceptionQ3 {

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Account account =new Account(56789, 2000);
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter withDraw Amount :");
        Double withDrawAmount = scanner.nextDouble();
        try {

            if(withDrawAmount>Account.balance) {
                throw new InsufficientBalanceException("Insufficent Balnce");
            }
            else if(withDrawAmount<-1) {
                throw new IllegalBankTransactionException("Illegal Bank Transaction");
            }
            else {
                System.out.println("Balance Amount: "+Account.withDraw(withDrawAmount));
            }

        } catch (InsufficientBalanceException e) {
            System.out.println(e);
        }
        catch (IllegalBankTransactionException e) {
            System.out.println(e);
        }
        scanner.close();

    }

}
