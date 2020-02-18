package com.capgemini.pecunia.DTO;

public class Account {
	private double accountBalance;
	private String accountHolderName;
	
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	public Account(double accountBalance, String accountHolderName) {
		super();
		this.accountBalance = accountBalance;
		this.accountHolderName = accountHolderName;
	}
	
	
	
	
}
