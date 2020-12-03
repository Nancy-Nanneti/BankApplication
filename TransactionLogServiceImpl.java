package com.bookapp.model.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.model.dao.TransactionLogDao;
import com.bookapp.model.entities.TransactionLog;
import com.bookapp.model.entities.TxType;


@Service
@Transactional
public class TransactionLogServiceImpl implements TransactionLogService{
	
	private TransactionLogDao txLogDao;
	
	@Autowired
	public TransactionLogServiceImpl(TransactionLogDao txLogDao) {
		this.txLogDao=txLogDao;
	}

	public TransactionLogDao getTxLogDao() {
		return txLogDao;
	}

	public void setTxLogDao(TransactionLogDao txLogDao) {
		this.txLogDao = txLogDao;
	}

	@Override
	public TransactionLog addTransactionLog(int accountId,String txInfo, Double amount, TxType txType) {
		return txLogDao.addTransactionLog(accountId,txInfo, amount, txType);
		
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
