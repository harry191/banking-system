package tests;

import com.qa.banking.core.*;

public class MainUnit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test_does_balance_match_after_creation();
		test_does_balance_match_after_debit();
		test_does_balance_match_after_credit();
		test_does_balance_match_after_debit_interest();
		
	}
	
	
	static void test_does_balance_match_after_creation() {
		double openBal = 20;
		Account a = new CreditAccount(1, "Joe", openBal, InterestRate.businessLoan);
		if (openBal == a.getBalance()) {
			System.out.println("test_does_balance_match_after_creation: PASSED");
		}else {
			System.out.println("test_does_balance_match_after_creation: FAILED");
		}
		
	}
	
	
	static void test_does_balance_match_after_debit() {
		double openBal = 20;
		double balDep = 40;
		Account a = new Account(1, "Joe", openBal);
		a.Debit(balDep);
		if ((openBal - balDep) == a.getBalance()) {
			System.out.println("test_does_balance_match_after_debit: PASSED");
		}else {
			System.out.println("test_does_balance_match_after_debit: FAILED");
		}
		
		
	}
	
	
	static void test_does_balance_match_after_credit() {
		double openBal = 20;
		double balDep = 40;
		Account a = new Account(1, "Joe", openBal);
		a.Credit(balDep);
		if ((openBal + balDep) == a.getBalance()) {
			System.out.println("test_does_balance_match_after_credit: PASSED");
		}else {
			System.out.println("test_does_balance_match_after_credit: FAILED");
		}
		
	}
	
	static void test_does_balance_match_after_debit_interest() {
		double openBal = 0;
		double balDep = 20;
		CreditAccount a = new CreditAccount(1, "Joe", openBal, InterestRate.homeLoan);
		a.Debit(balDep);
		if (((-balDep)*((5.0 / 100)+1)) == a.getBalance()) {
			System.out.println("test_does_balance_match_after_debit_interest: PASSED");
		}else {
			System.out.println("test_does_balance_match_after_debit_interest: FAILED");
		}
		
	}

}
