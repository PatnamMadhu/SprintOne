package com.capgemini.pecunia.DTO;

import java.time.LocalDate;

public class Passbook {
	private long accountNumber;
	LocalDate fdate;
	LocalDate tdate;
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public LocalDate getFdate() {
		return fdate;
	}
	public void setFdate(LocalDate localDate) {
		this.fdate = localDate;
	}
	public LocalDate getTdate() {
		return tdate;
	}
	public void setTdate(LocalDate tdate) {
		this.tdate = tdate;
	}

}
