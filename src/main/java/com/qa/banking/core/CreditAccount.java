package com.qa.banking.core;

public class CreditAccount extends Account{
	InterestRate rate;
	public CreditAccount(int id, String name, double balance, InterestRate rate) {
		super(id, name, balance);
		this.rate = rate;
	
	
	
	}
	public InterestRate getRate() {
		return rate;
	}
	public double getAmounttodebit() {
		return amounttodebit;
	}
	private double amounttodebit;
	public double Debit(double withdrawn) {
		if ((getBalance() - withdrawn)<0) {
			amounttodebit = ((withdrawn)*((rate.getRate() / 100)+1));
			double balance = super.Debit(amounttodebit);
			return balance;
		}else {
			balance = getBalance() + (withdrawn * -1);
			super.Debit(balance);
			return balance;
		}
		
	}


	

}
