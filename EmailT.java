package sevenpointfive;

public class EmailT extends Thread {
		int balance;

		public EmailT(int balance) {
			this.balance = balance;
			// TODO Auto-generated constructor stub
		}

		@Override
		public synchronized void run() {
			super.run();
			System.out.println("Withdrawal has been made!");
	}
}
