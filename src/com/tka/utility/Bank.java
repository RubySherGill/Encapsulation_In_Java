package com.tka.utility;

public class Bank {
	private String name;
	private double accountNo;
	private float balance;
	private float amount;
	
	public Bank() {
		// TODO Auto-generated constructor stub
	}

	public Bank(String name, double accountNo, float balance, float amount) {
		super();
		this.name = name;
		this.accountNo = accountNo;
		this.balance = balance;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(double accountNo) {
		this.accountNo = accountNo;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + ", accountNo=" + accountNo + ", balance=" + balance + ", amount=" + amount + "]";
	}
	
	

}
