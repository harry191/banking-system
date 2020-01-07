package com.qa.banking.core;

import java.util.AbstractList;
import java.util.ArrayList;

public class Account {
	
	private final int id;
	private final String name;
	protected double balance;
	private double amount;


	public AbstractList<Transaction> getTransactions() {
		return transactions;
	}

	protected final AbstractList<Transaction>	transactions = new ArrayList<Transaction>();

	public double Credit(double deposit) {
		balance = getBalance() + deposit;
		transactions.add(new Transaction(deposit));
		
		return getBalance();
	}
	
	public double Debit(double withdrawn) {
		balance = getBalance() + withdrawn * -1;
		transactions.add(new Transaction(withdrawn * -1));
		return getBalance();
	}
	
	public double CurrentBalance(double balance) {
		return balance;
	}
	
	public double AvaliableBalance(double balance) {
		this.balance = balance;
		balance = 0;
		
		for (Transaction t : transactions) {
			balance += t.getAmount();
		}
		return balance;
	}
	
	public Account(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		Credit(balance);
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public double getAmount() {
		return amount;
	}
	
}



