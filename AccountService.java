package com.bookapp.model.service;

import java.util.List;

import com.bookapp.model.entities.Account;

public interface AccountService {
	public List<Account> getAllAccounts();
	public void deposit(int accountId,double amount);
	public void withdraw(int accountId,double amount);
	public void transfer(int fromAccountId, int toAccountId,double amount);
	public void updateAddress(int accountId, String address, String phone,String email);
	public Account delAccount(int accountId);
	public Account getAccountById(int accountId);
	public Account addAccount(Account account);
	

}
