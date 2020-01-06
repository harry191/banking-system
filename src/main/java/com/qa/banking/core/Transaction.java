package com.qa.banking.core;

import java.time.Instant;
import java.util.Date;

public class Transaction {
	private double amount;
	private Instant when = Instant.now();

	public Transaction(double amount) {
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public Instant getWhen() {
		return when;
	}

	
}
