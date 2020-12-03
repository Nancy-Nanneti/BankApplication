package com.bookapp.model.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="Transaction")
public class TransactionLog {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer txId;
	private String txInfo;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date timeStamp;
	private Double Amount;
	
	@Enumerated(EnumType.STRING)
	private TxType txType;
	public TransactionLog() {}
	public Integer getTxId() {
		return txId;
	}
	public void setTxId(Integer txId) {
		this.txId = txId;
	}
	public String getTxInfo() {
		return txInfo;
	}
	public void setTxInfo(String txInfo) {
		this.txInfo = txInfo;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public Double getAmount() {
		return Amount;
	}
	public void setAmount(Double amount) {
		Amount = amount;
	}
	public TxType getTxType() {
		return txType;
	}
	public void setTxType(TxType txType) {
		this.txType = txType;
	}
	public TransactionLog(Integer txId, String txInfo, Double amount, TxType txType) {
		super();
		this.txId = txId;
		this.txInfo = txInfo;
		this.timeStamp = new Date();
		Amount = amount;
		this.txType = txType;
	}
	
	
	@Override
	public String toString() {
		return "TransactionLog [txId=" + txId + ", txInfo=" + txInfo + ", timeStamp=" + timeStamp + ", Amount=" + Amount
				+ ", txType=" + txType + "]";
	}
	public TransactionLog(String txInfo, Double amount, TxType txType) {
		this.txInfo = txInfo;
		Amount = amount;
		this.txType = txType;
	}

}
