package com.qa.banking.core;

public class CreditAccount extends Account{
	InterestRate rate;
	public CreditAccount(int id, String name, double balance, InterestRate rate) {
		super(id, name, balance);
		this.rate = rate;
	}

}
