package com.bookapp.web.formbeans;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class DepositBean {
	
	@NotEmpty(message="account id can not be null")
	private Integer fromAccountId;
	
	@NotEmpty(message="amount should be entered")
	@Min(value=50, message="money should be more than 500")
	@Max(value=10000,message="money should be less than 100000")
	private Double amount;
	
	public Integer getFromAccountId() {
		return fromAccountId;
	}
	public void setFromAccountId(Integer fromAccountId) {
		this.fromAccountId = fromAccountId;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	

}
