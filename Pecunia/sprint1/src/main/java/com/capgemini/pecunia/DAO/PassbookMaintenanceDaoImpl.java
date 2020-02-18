package com.capgemini.pecunia.DAO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.capgemini.pecunia.DTO.Account;
import com.capgemini.pecunia.DTO.Transaction;
import com.capgemini.pecunia.exceptions.AccountNumberValidation;
import com.capgemini.pecunia.util.AccountListRepository;
import com.capgemini.pecunia.util.TransactionRepository;

public class PassbookMaintenanceDaoImpl implements PassbookMaintenanceDao 
{	
	
	AccountListRepository accountObj=new AccountListRepository();
	static TransactionRepository transactionObj=new TransactionRepository(); 

	static List<Transaction>  transaction=transactionObj.getTransaction();
	LocalDateTime now = LocalDateTime.now(); 
	DateTimeFormatter formatter =DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	
	public boolean accountValidation(String accountNumber) throws AccountNumberValidation
	{
		
		Map<Long,Account> accounts=accountObj.getAccounts();
		long accountId;
		
		if(accountNumber.length()!=11) 
		{
			throw new AccountNumberValidation("Invalid account Number");
		}
		
		try 
		{
			accountId=Long.parseLong(accountNumber);
		}
		catch(NumberFormatException e) 
		{
			throw new AccountNumberValidation("Invalid account Number");
		}
		
		if(accounts.containsKey(accountId)) 
		{
		
			System.out.println("A/C Number\t"+"A/C HolderName"+"AvailableBalance");
			System.out.println(accountId+"		"+accounts.get(accountId).getAccountHolderName()+"		"+accounts.get(accountId).getAccountBalance()+"\n");
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	
	
	public List<Transaction> updatePassbook(String accountID) 
	{
		long accountNumber=Long.parseLong(accountID);
		List<Transaction> transactionList=new ArrayList<Transaction>();
		
		for(Transaction x: transaction) 
		{
			if(x.getAccountNumber()==accountNumber) 
			{
				transactionList.add(x);
			}
		}
		return transactionList;
		
	}

	
public List<Transaction> accountSummary(String accountID, LocalDate fDate, LocalDate lDate) throws AccountNumberValidation
	{
		if(lDate.isAfter(LocalDate.parse(formatter.format(now), formatter))) 
		{
			throw new AccountNumberValidation("End Date Must be before the current date");
		}
		if(fDate.isAfter(lDate)) 
		{
			throw new AccountNumberValidation("Starting Date should be less than the end Date");
		}
		
		long accountNumber=Long.parseLong(accountID);
		List<Transaction> transactionListDate=new ArrayList<Transaction>();
		
		for(Transaction x: transaction) 
		{
			if(x.getAccountNumber()==accountNumber && x.getDate().compareTo(fDate)>0 && x.getDate().compareTo(lDate)<0) 
			{

					transactionListDate.add(x);
					System.out.println(x.getMoney());
			}
		}

		return transactionListDate;
	}
	
}
