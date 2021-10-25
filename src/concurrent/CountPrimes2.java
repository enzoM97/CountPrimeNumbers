package concurrent;

import java.text.NumberFormat;
import java.util.Date;

public class CountPrimes2 {

	public static void main(String[] args) {
		
		long t0 = (new Date().getTime());
		PrimesThread p1 = new PrimesThread(1, 2000000);
		PrimesThread p2 = new PrimesThread(2000001, 4000000);
		PrimesThread p3 = new PrimesThread(4000001, 6000000);
		PrimesThread p4 = new PrimesThread(6000001, 8000000);
		PrimesThread p5 = new PrimesThread(8000001, 10000000);
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		
		try {
			p1.join();
			p2.join();
			p3.join();
			p4.join();
			p5.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		long t1 = (new Date().getTime());
		
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println("Prime numbers lesser than 10000000: " + nf.format(PrimesThread.count()) + 
				" calculated in " + nf.format(t1 - t0) + " ms");
	}

}
