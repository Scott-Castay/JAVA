package com.scott.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		
		 BankAccount account1 = new BankAccount();
	     System.out.println(account1.getCheckingBalance());
	     account1.depositChecking(200);
	     account1.depositSaving(700);

	     System.out.println(account1.getCheckingBalance());
	     System.out.println(account1.getSavingsBalance());

	     account1.withdrawChecking(700);
	     account1.withdrawSavings(450);

	     System.out.println(account1.getCheckingBalance());
	     System.out.println(account1.getSavingsBalance());

	     System.out.println(BankAccount.numberOfAccounts);
	     System.out.println(BankAccount.totalAmount);
	}

}
