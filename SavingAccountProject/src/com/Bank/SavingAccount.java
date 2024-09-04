package com.Bank;

public class SavingAccount {
	int accounNo;
	String accountName;
	double balance;

	public synchronized void deposit(int amt) {
		balance = balance + amt;
	}

	public synchronized void withdraw(int amt) {
		balance = balance - amt;
	}

	public SavingAccount() {
		super();

	}

	public SavingAccount(int accounNo, String accountName, double balance) {
		super();
		this.accounNo = accounNo;
		this.accountName = accountName;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "SavingAccount [accounNo=" + accounNo + ", accountName=" + accountName + ", balance=" + balance + "]";
	}

}
