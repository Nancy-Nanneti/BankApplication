package com.bookapp.model.dao;

import java.util.*;

import com.bookapp.model.entities.Account;

public interface AccountDao {
	public List<Account> getAllAccounts();
	public Account updateAccount(Account account);
	public Account delAccount(int accountId);
	public Account getAccountById(int accountId);
	public Account addAccount(Account account);
	

}
