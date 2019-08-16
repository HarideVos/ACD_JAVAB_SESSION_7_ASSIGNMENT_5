package sevenpointfive;

import java.io.File;

public class WithdrawalT extends Thread {
	int balance;
	File f;

	public WithdrawalT(int balance) {
		// TODO Auto-generated constructor stub
		this.balance = balance;
	}

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		super.run();
		balance = withdraw(balance);
		System.out.println("Balance: " + balance);
	}

	public int withdraw(int balance) {
		for (int i = 0; i < 10; i++) {
			balance = balance - 50;
		}
		return balance;
	}
}