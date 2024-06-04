package com.tka.utility;

public class BankOperations {
	
	public static void depositMoney(float amount) {
		float balance=70000;
		if(amount!=0) {
			balance = amount+balance;
			System.out.println("Money deposit Successfully");
		}
		else {
			System.out.println("Money not deposit Successfully");
		}
	}
	
	public static void withdrawMoney(float amount,float balance) {
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
	
}


