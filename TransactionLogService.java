package com.bookapp.model.service;

import java.util.List;

import com.bookapp.model.entities.TransactionLog;
import com.bookapp.model.entities.TxType;

public interface TransactionLogService {

	public TransactionLog addTransactionLog(int accountId,String txInfo, Double amount, TxType txType);
	public List<TransactionLog> getAllTransactionLogs();
	public List<TransactionLog> getAllTransactionLogsForAnAccount(int accountId);

}
