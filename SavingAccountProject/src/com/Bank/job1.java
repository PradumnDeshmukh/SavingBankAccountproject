package com.Bank;

public class job1 extends Thread {
	SavingAccount sa;

	public job1(SavingAccount sa) {
		super();
		this.sa = sa;

	}

	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {

			sa.withdraw(5);
		}
	}
}
