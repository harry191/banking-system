package tests;

import com.qa.banking.core.*;

public class MainUnit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test_does_balance_match_after_creation();
		test_does_balance_match_after_debit();
		test_does_balance_match_after_credit();
		
	}
	
	
	static void test_does_balance_match_after_creation() {
		double openBal = 20;
		Account a = new Account(1, "Joe", openBal);
		if (openBal == a.getBalance()) {
			System.out.println("Works");
		}else {
			System.out.println("Nope");
		}
		
	}
	
	
	static void test_does_balance_match_after_debit() {
		double openBal = 20;
		double balDep = 40;
		Account a = new Account(1, "Joe", openBal);
		a.Debit(balDep);
		System.out.println(a.getBalance());
		
	}
	
	
	static void test_does_balance_match_after_credit() {
		double openBal = 20;
		double balDep = 40;
		Account a = new Account(1, "Joe", openBal);
		a.Credit(balDep);
		System.out.println(a.getBalance());
		
	}

}
