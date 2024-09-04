package com.Bank;

public class testThreadBank {
	public static void main(String[] args) throws InterruptedException {
		SavingAccount s1 = new SavingAccount(57863673, "ram pawar", 500);
		job1 j1 = new job1(s1);
		job2 j2 = new job2(s1);
		Thread n1 = new Thread(j2);
		j1.start();
		n1.start();
		j1.join();
		n1.join();
		System.out.println(s1.balance);

	}

}