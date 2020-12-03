package com.bookapp.model.entities;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Account")
public class Account {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="account_id")
	private Integer Aid;
	@Column(nullable=false)
	private String name;
	
	@Column(nullable=false)
	private String address;
	
	@Column(nullable=false)
	private Double balance;
	
	@Column(nullable=false)
	private String phoneno;
	
	@Column(nullable=false)
	private String email;
	
	@Column(unique=true,nullable=false)
	private String aadharCard;
	
	@Column(unique=true,nullable=false)
	private String panCard;
	
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="account_id_fk")
	private List<TransactionLog> txlog=new ArrayList<>();
	
	@Enumerated(EnumType.STRING)
	private AccountType accountType;
	
	public Account() {}
	
	private AccountStatus accountStatus=AccountStatus.Active;
	
	
	public AccountStatus getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(AccountStatus accountStatus) {
		this.accountStatus = accountStatus;
	}
	public AccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	public Integer getAid() {
		return Aid;
	}
	public void setAid(Integer aid) {
		Aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAadharCard() {
		return aadharCard;
	}
	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	public List<TransactionLog> getTxlog() {
		return txlog;
	}
	public void setTxlog(List<TransactionLog> txlog) {
		this.txlog = txlog;
	}
	public Account(Integer aid, String name, String address, Double balance, String phoneno, String email,
			String aadharCard, String panCard, List<TransactionLog> txlog) {
		super();
		Aid = aid;
		this.name = name;
		this.address = address;
		this.balance = balance;
		this.phoneno = phoneno;
		this.email = email;
		this.aadharCard = aadharCard;
		this.panCard = panCard;
		this.txlog = txlog;
	}
	public Account(String name, String address, Double balance, String phoneno, String email, String aadharCard,
			String panCard, List<TransactionLog> txlog) {
		super();
		this.name = name;
		this.address = address;
		this.balance = balance;
		this.phoneno = phoneno;
		this.email = email;
		this.aadharCard = aadharCard;
		this.panCard = panCard;
		this.txlog = txlog;
	}
	
	public Account(String name, String address, Double balance, String phoneno, String email,
			String aadharCard, String panCard, AccountType accountType) {
		this.name = name;
		this.address = address;
		this.balance = balance;
		this.phoneno = phoneno;
		this.email = email;
		this.aadharCard = aadharCard;
		this.panCard = panCard;
		//this.txlog = txlog;
		this.accountType = accountType;
	}
	@Override
	public String toString() {
		return "Account [Aid=" + Aid + ", name=" + name + ", address=" + address + ", balance=" + balance + ", phoneno="
				+ phoneno + ", email=" + email + ", aadharCard=" + aadharCard + ", panCard=" + panCard + ", txlog="
				+ txlog + "]";
	}


}
