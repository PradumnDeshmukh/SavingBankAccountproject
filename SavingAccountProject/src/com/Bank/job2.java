package com.Bank;

public class job2 implements Runnable {
	SavingAccount sa;

	public job2(SavingAccount sa) {
		super();
		this.sa = sa;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {

			sa.deposit(10);
		}
	}

}
