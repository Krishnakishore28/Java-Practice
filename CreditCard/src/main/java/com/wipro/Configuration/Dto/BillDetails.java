package com.wipro.Configuration.Dto;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;

public class BillDetails {
	private CreditCardNumber creditcardNumber;
	private Currency currency;
	private Date date;
	private BigDecimal amount;
	@Override
	public String toString() {
		return "BillDetails [creditcardNumber=" + creditcardNumber + ", currency=" + currency + ", date=" + date
				+ ", amount=" + amount + "]";
	}
	public CreditCardNumber getCreditcardNumber() {
		return creditcardNumber;
	}
	public void setCreditcardNumber(CreditCardNumber creditcardNumber) {
		this.creditcardNumber = creditcardNumber;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	

}
