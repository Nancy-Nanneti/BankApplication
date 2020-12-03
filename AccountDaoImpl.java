package com.bookapp.model.dao.Impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookapp.model.dao.AccountDao;
import com.bookapp.model.dao.Exceptions.AccountNotFoundException;
import com.bookapp.model.entities.Account;

@Repository
public class AccountDaoImpl implements AccountDao{
	
	private SessionFactory factory;
	
	@Autowired
	public AccountDaoImpl(SessionFactory factory) {
		super();
		this.factory = factory;
	}

	private Session getSession() {
		return factory.getCurrentSession();
	}

	@Override
	public List<Account> getAllAccounts() {

		return getSession().createQuery("select from  Account").list();
	}

	@Override
	public Account updateAccount(Account account) {
		getSession().update(account);
		return account;
	}

	@Override
	public Account delAccount(int accountId) {
		Account accountToBeDeleted=getAccountById(accountId);
		getSession().delete(accountToBeDeleted);
		return accountToBeDeleted;
	}

	@Override
	public Account getAccountById(int accountId) {
		Account account=getSession().find(Account.class,accountId);
		if(account==null) {
			throw new AccountNotFoundException("Account with id is not found"+account);
		}
		else {
			return account;
		}
	}

	@Override
	public Account addAccount(Account account) {
		getSession().persist(account);
		return account;
	}
	

}
