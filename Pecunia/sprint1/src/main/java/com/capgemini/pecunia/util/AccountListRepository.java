package com.capgemini.pecunia.util;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.pecunia.DTO.Account;

public class AccountListRepository {
	private static Map<Long,Account> accounts=new HashMap<Long,Account>();
	public AccountListRepository(){
		accounts.put(20424444083l, new Account(96300,"Madhu"));
		accounts.put(20424444081l, new Account(27000,"Yogesh"));
		accounts.put(20424444082l, new Account(36000,"Shashwat"));
		accounts.put(20424444084l, new Account(10000,"subham"));
		accounts.put(20424444085l, new Account(96000,"Flemo"));
	}
	public  Map<Long, Account> getAccounts() {
		return accounts;
	}
}
