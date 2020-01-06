package com.qa.banking.core;

public enum InterestRate {
	
	homeLoan(5.0),
	businessLoan(2.0);

	private double rate;

	InterestRate(double rate) {
		this.rate = rate;
	}
	
	public double getRate() {
		return rate;
	}
	
	
	
	

}
