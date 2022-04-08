package assignment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BankAccountLifecycleTest {

	long id;
	double amount;
	double withDrawAmount;
	BankAccount account;
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Running the test Cases");
	}
	
	@BeforeEach
	void BeforeEach() {
		account=new BankAccount(id, amount);
		System.out.println("Test Case Started");
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("Test Case Runned Successfully");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("All test cases completed");
	}

	@Test
	@DisplayName("Test1")
	void test1() {
		id=123;
		amount=19999;
		withDrawAmount=20000;
		account=new BankAccount(id, amount);
		assertThrows(InsufficientBalanceException.class, ()->account.withDraw(withDrawAmount));
		
	}
		
		@Test
		@DisplayName("Test2")
		void test2() {
			id=122;
			amount=21000;
			withDrawAmount=-20000;
			account=new BankAccount(id, amount);
			assertThrows(IllegalBankTransactionException.class, ()->account.withDraw(withDrawAmount));
			
		}

}