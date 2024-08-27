package com.wipro.Configuration.Dto;

public class CreditCardNumber {
	private Integer firstNumber;
	private Integer SecondNumber;
	private Integer thirdNumber;
	private Integer fourthNumber;
	@Override
	public String toString() {
		return getFirstNumber()+"-"+getSecondNumber()+"-"+getThirdNumber()
		+"-"+getFourthNumber();
	}
	public Integer getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(Integer firstNumber) {
		this.firstNumber = firstNumber;
	}
	public Integer getSecondNumber() {
		return SecondNumber;
	}
	public void setSecondNumber(Integer secondNumber) {
		SecondNumber = secondNumber;
	}
	public Integer getThirdNumber() {
		return thirdNumber;
	}
	public void setThirdNumber(Integer thirdNumber) {
		this.thirdNumber = thirdNumber;
	}
	public Integer getFourthNumber() {
		return fourthNumber;
	}
	public void setFourthNumber(Integer fourthNumber) {
		this.fourthNumber = fourthNumber;
	}
	

}
