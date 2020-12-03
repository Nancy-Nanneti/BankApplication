package com.bookapp.model.service;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.model.dao.AccountDao;
import com.bookapp.model.entities.Account;
import com.bookapp.model.entities.TransactionLog;
import com.bookapp.model.entities.TxType;

@Service
@Transactional 
public class AccountServiceImpl implements AccountService {
	
	private AccountDao accountDao;
	
	private TransactionLogService transactionLogService;
	
	@Autowired
	public AccountServiceImpl(AccountDao accountDao, TransactionLogService transactionLogService) {
		super();
		this.accountDao = accountDao;
		this.transactionLogService = transactionLogService;
	}

	@Override
	public List<Account> getAllAccounts() {
		return accountDao.getAllAccounts();
	}

	@Override
	public void deposit(int accountId, double amount) {
		Account account=accountDao.getAccountById(accountId);
		account.setBalance(account.getBalance()+amount);
		accountDao.updateAccount(account);
		transactionLogService.addTransactionLog(accountId,"deposit amount", amount, TxType.Deposit);
		
	}

	@Override
	public void withdraw(int accountId, double amount) {
		Account account=accountDao.getAccountById(accountId);
		account.setBalance(account.getBalance()-amount);
		TransactionLog log=new TransactionLog("withdraw amount",amount,TxType.Withdraw);
		accountDao.updateAccount(account);
				
	}

	@Override
	public void transfer(int fromAccountId, int toAccountId, double amount) {
		Account fromAccount=accountDao.getAccountById(fromAccountId);
		Account toAccount=accountDao.getAccountById(toAccountId);
		fromAccount.setBalance(fromAccount.getBalance()-amount);
		toAccount.setBalance(toAccount.getBalance()+amount);
		TransactionLog l1=new TransactionLog("transfer to another account",amount,TxType.Transfer);
		accountDao.updateAccount(fromAccount);
		accountDao.updateAccount(toAccount);
		//fromAccount.getTransactionLog().add(l1);
//		withdraw(fromAccountId,amount);
//		deposit(toAccountId,amount);
		
		
	}

	@Override
	public void updateAddress(int accountId, String address, String phone, String email) {
		Account account=accountDao.getAccountById(accountId);
		account.setAddress(address);
		account.setPhoneno(phone);
		account.setEmail(email);
		accountDao.updateAccount(account);
	}

	@Override
	public Account delAccount(int accountId) {
		return accountDao.delAccount(accountId);
	}

	@Override
	public Account getAccountById(int accountId) {
		return accountDao.getAccountById(accountId);
	}

	@Override
	public Account addAccount(Account account) {
		return accountDao.addAccount(account);
	}

}
