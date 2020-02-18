package com.capgemini.pecunia.services;

import java.time.LocalDate;
import java.util.List;
import com.capgemini.pecunia.DAO.PassbookMaintenanceDaoImpl;
import com.capgemini.pecunia.DTO.Transaction;
import com.capgemini.pecunia.exceptions.AccountNumberValidation;

public class PassbookMaintenanceServiceImpl implements PassbookMaintenanceService
{

	PassbookMaintenanceDaoImpl accountObj=new PassbookMaintenanceDaoImpl();
		
	public boolean accountVerificationService(String accountId) throws AccountNumberValidation
	{
		boolean result=accountObj.accountValidation(accountId);
		return result;
	}
	
	public List<Transaction> updatePassbook(String accountNumber) 
	{
		
		return accountObj.updatePassbook(accountNumber);
		
	}

	public List<Transaction> accountSummary(String accountNumber, LocalDate fdate, LocalDate lDate) throws AccountNumberValidation
	{
		
		List<Transaction> dateList= accountObj.accountSummary(accountNumber, fdate, lDate);
		return dateList;
		
	}
}