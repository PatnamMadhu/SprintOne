package com.capgemini.pecunia.services;

import java.time.LocalDate;
import java.util.List;

import com.capgemini.pecunia.exceptions.AccountNumberValidation;

public interface PassbookMaintenanceService {
	public List<?> updatePassbook(String accountNumber);
	public List<?> accountSummary(String accountNumber,LocalDate fdate,LocalDate lDate) throws AccountNumberValidation;
}
