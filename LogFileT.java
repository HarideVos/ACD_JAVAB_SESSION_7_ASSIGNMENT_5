package sevenpointfive;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LogFileT extends Thread {
		File f;
		BufferedWriter br;

		public LogFileT(File f2) {
			this.f = f2;// TODO Auto-generated constructor stub
		}

		@Override
		public synchronized void run() {
			// TODO Auto-generated method stub
			super.run();
			try {
				br = new BufferedWriter(new FileWriter(f, true));
				br.write("Check your email and phone; you got a message.");
				System.out.println("Sent");
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		}
	}
}
