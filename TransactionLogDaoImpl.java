package com.bookapp.model.dao.Impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookapp.model.dao.TransactionLogDao;
import com.bookapp.model.entities.TransactionLog;
import com.bookapp.model.entities.TxType;

@Repository
public class TransactionLogDaoImpl implements TransactionLogDao {

	private SessionFactory factory;

	@Autowired
	public TransactionLogDaoImpl(SessionFactory factory) {
		this.factory = factory;
	}
	
	private Session getSession() {
		return factory.getCurrentSession();
	}


	@Override
	public TransactionLog addTransactionLog(int accountId,String txInfo, Double amount, TxType txType) {
		TransactionLog log=new TransactionLog(txInfo, amount, txType);
		getSession().persist(log);
		return log;
	}

	@Override
	public List<TransactionLog> getAllTransactionLogs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TransactionLog> getAllTransactionLogsForAnAccount(int accountId) {
		// TODO Auto-generated method stub
		return null;
	}

}
