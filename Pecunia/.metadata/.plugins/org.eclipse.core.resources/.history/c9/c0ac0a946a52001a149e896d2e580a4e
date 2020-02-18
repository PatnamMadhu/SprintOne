package com.capgemini.pecunia.DTO;

import java.time.LocalDate;

public class Transaction {
	
	private long accountNumber;
	private long money;
	LocalDate date;
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public long getMoney() {
		return money;
	}
	public void setMoney(long money) {
		this.money = money;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	@Override
	public boolean equals(Object obj) {
		Transaction t=(Transaction)obj;
		boolean status=false;
		if(this.accountNumber==t.getAccountNumber()&&this.money==t.getMoney()&&(this. date).isEqual(t.getDate())) 
		{
			status=true;
		}
		return status;
	}
	

	
}
