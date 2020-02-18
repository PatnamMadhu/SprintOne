package com.capgemini.pecunia.DAO;

import java.time.LocalDate;
import java.util.List;

import com.capgemini.pecunia.exceptions.AccountNumberValidation;

public interface PassbookMaintenanceDao {
	public List<?> updatePassbook(String accountNumber);
	public List<?> accountSummary(String accountNumber,LocalDate fdate,LocalDate lDate) throws AccountNumberValidation;
	public boolean accountValidation(String accountNumber) throws AccountNumberValidation;
}
