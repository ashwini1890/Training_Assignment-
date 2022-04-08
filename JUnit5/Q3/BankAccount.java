/**
 * Write a BankAccount class with method withdraw which accepts amount to be withdrawn
from the account (amount to be deducted from the balance of the account). In case there
are insufficient funds a InsufficientFundsExpcetion should be raised. After defining the
method perform Junit testing to check whether the InsufficientFundsException is raised
when you try to withdraw amount that is over and above the account balance.
bankAccount.withdraw(20,000); should raise the InsufficientFundsException if the
balance in the account is less than 20,000. 
 */

package assignment1;

public class BankAccount {
	long id;
	double balance;
	public  BankAccount(long id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	public void withDraw(double Amount) throws Exception {
		if(Amount>balance) {
			throw new InsufficientBalanceException("Insufficent Balnce");
		}
		else if(Amount<-1) {
			throw new IllegalBankTransactionException("Illegal Bank Transaction");
		}
		else {
			System.out.println(balance-Amount);
		}
	}
	public void deposit(double Amount) {
		System.out.println(balance+Amount);
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