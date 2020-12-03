package com.bookapp.model.dao;

import java.util.*;

import com.bookapp.model.entities.TransactionLog;
import com.bookapp.model.entities.TxType;

public interface TransactionLogDao {
	public TransactionLog addTransactionLog(int accountId,String txInfo, Double amount, TxType txType);
	public List<TransactionLog> getAllTransactionLogs();
	public List<TransactionLog> getAllTransactionLogsForAnAccount(int accountId);

}
