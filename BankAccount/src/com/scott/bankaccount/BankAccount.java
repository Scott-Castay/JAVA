package com.scott.bankaccount;

import java.util.Random;

public class BankAccount {
	
	 private double checkingBalance;
	 private double savingsBalance;

	 public static int numberOfAccounts = 0;
	 public static int totalAmount = 0;
	 
	 public BankAccount(){
	 BankAccount.numberOfAccounts++;
	 this.checkingBalance = checkingBalance;
	 this.savingsBalance = savingsBalance;
	 this.accountNumber = BankAccount.createAccountNumber();
	 }
	 
	 public double getCheckingBalance() {
		 return this.checkingBalance;
	 }

	 public double getSavingsBalance() {
		 return this.savingsBalance;
	 }
	 
	 public static double getNumberOfAccounts(){
	     return BankAccount.numberOfAccounts;
	 }
	 
	 public static double getTotalAmount(){
	     return BankAccount.totalAmount;
	 }
	  
	 public void depositChecking(double depositAmount) {
	     this.checkingBalance += depositAmount;
	     totalAmount += depositAmount;
	 }

	 public void depositSaving(double depositAmount) {
	     this.savingsBalance += depositAmount;
	     totalAmount += depositAmount;
	 }
	 
	 public void withdrawChecking(double amount) {
		 if(this.checkingBalance < amount) {
	            System.out.println("Overdraft Error");
	     }
	     else {
	            this.checkingBalance -= amount; 
	            totalAmount -= amount;
	            System.out.println(getCheckingBalance());
	     }
		 
	 public void withdrawSavings(double amount) {
		 if(this.savingsBalance < amount) {
		            System.out.println("Overdraft Error");
		        }
		 else {
		       	this.savingsBalance -= amount;
		        totalAmount -= amount;
		        System.out.println(getSavingsBalance()); 
		 }
		 
	 
	 
	 
	 

}
