package com.tka.encapsulation;

public class TestBank {
	public static void main(String[] args) {
		Bank bank = new Bank("Myrub",12345678,500);
		bank.depositMoney(10000);
		bank.withdrawMoney(-2000);
		
		System.out.println("\nName : "+bank.getName());
		System.out.println("Account no : "+bank.getAccountNumber());
		System.out.println("Balance : "+bank.getBalance());
		
		
	}

}
