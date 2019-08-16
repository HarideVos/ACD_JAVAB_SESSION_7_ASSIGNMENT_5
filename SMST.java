package sevenpointfive;

public class SMST extends Thread {
	int balance;

	public SMST (int balance) {
		this.balance = balance;
		// TODO Auto-generated constructor stub
	}

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("Withdrawal has been made!");

	}
}