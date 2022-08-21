package com.bridgelabz.accountmanagement;

import java.util.Scanner;

public class AccountMain {
	
	static Scanner sc = new Scanner(System.in);

	public static void withdrawalOption()  {
		
		Account ac = new Account();
		System.out.println("Press 1. for Balance Enquiry\nPress 2. for Debit Amount");
		int option = sc.nextInt();
		
		switch(option) {
		
		case 1 : 
			System.out.println("Account Balance is : " +ac.getAmount());
			withdrawalOption();  // using recursion
			break;
		
		case 2 :
			int i = 0;
			while( i < 15) {
				if(ac.getAmount() == 0) {
					
				}
				else 
					ac.debit();
			}
			if(ac.getAmount() != 0) {
				withdrawalOption();
			}
			break;
			
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to account management system");
		withdrawalOption();
		

	}

}
