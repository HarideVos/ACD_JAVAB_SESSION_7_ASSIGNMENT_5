package sevenpointfive;

import java.io.File;


public class AccountWithdrawalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int balance = 1000;
		File f = new File("messages.txt");
		WithdrawalT t1 = new WithdrawalT(balance);
		EmailT t2 = new EmailT(t1.balance);
		SMST t3 = new SMST(t1.balance);
		LogFileT t4 = new LogFileT(f);
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}