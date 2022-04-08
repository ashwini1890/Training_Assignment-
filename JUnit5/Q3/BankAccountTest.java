package assignment1;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

	class BankAccountTest {
		long id;
		double amount;
		double withDrawAmount;
		BankAccount account;
		ByteArrayOutputStream outContent;
		
		@BeforeEach
		void BeforeEach() {
			account=new BankAccount(id, amount);
			outContent = new ByteArrayOutputStream();
		    System.setOut(new PrintStream(outContent));
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
			
			@Test
			@DisplayName("Test3")
			void test3() {
				id=120;
				amount=21000;
				withDrawAmount=20000;
				account=new BankAccount(id, amount);
				try {
					account.withDraw(withDrawAmount);
				} catch (Exception e) {
					
				}
				String expected =String.valueOf(amount-withDrawAmount);
				assertEquals(expected, outContent.toString().trim());
			}
			
			@Test
			@DisplayName("Test4")
			void test4() {
				id=129;
				amount=21000;
				withDrawAmount=10000;
				account=new BankAccount(id, amount);
				try {
					account.withDraw(withDrawAmount);
				} catch (Exception e) {
					
				}
				String expected =String.valueOf(amount-withDrawAmount);
				assertEquals(expected, outContent.toString().trim());
			}
	}

