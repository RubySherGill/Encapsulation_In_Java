package com.tka.encapsulation;

public class Bank {
	private String Name;
	private long accountNumber;
	private float balance;


	public Bank() {
		// TODO Auto-generated constructor stub
	}

	public Bank(String name, long accountNumber, int balance) {
		super();
		Name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;

	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void withdrawMoney(float amount) {
		if (amount <= 0) {
			System.out.println("Enter a valid Amount");
		} else if (amount > 100000) {
			System.out.println("You can't withdraw money more than 100000");
		} else if (amount > balance) {
			System.out.println("Insufficent balance");
		} else {
			balance = balance - amount;
			System.out.println("Rs. " + amount + " Withdraw Successfully");
			System.out.println("Remainning balance is : " + balance);
		}
	}

	public void depositMoney(float amount) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("Rs. " + amount + " Deposit Successfully ");
			System.out.println("Total balance is : " + balance);
		} else {
			System.out.println("Invalid amount");
		}
	}

	@Override
	public String toString() {
		return "Bank [Name=" + Name + ", accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}

}
