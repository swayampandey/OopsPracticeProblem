package com.bridgelabz.accountmanagement;

import java.util.Scanner;

public class Account {
	
	private double amount = 500000.0;
	private double debitAmount;
	
	Scanner sc = new Scanner(System.in);
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getDebitAmount() {
		return debitAmount;
	}
	public void setDebitAmount(double debitAmount) {
		this.debitAmount = debitAmount;
	}
	
	public void debit() {
		
		System.out.println("Enter the withdrawl amount : ");
		debitAmount = sc.nextDouble();
		if(amount > debitAmount ) {
			amount = amount - debitAmount;
			System.out.println(" Money Withdrawn New Balance is : Rs.\n" +amount);
		}
		else if (amount == debitAmount) {
			amount = 0;
			System.out.println(" Remaining balance is : 0 ");
		}
		else {
			amount = getAmount();
			System.out.println(" Debit balance exceeds account balance ");
		}
		
	}
	
	

}
