package secuential;

import java.text.NumberFormat;
import java.util.Date;

public class CountPrimes {

	public static void main(String[] args) {
		
		long t0 = (new Date().getTime());
		Primes p1 = new Primes(1, 2000000);
		Primes p2 = new Primes(2000001, 4000000);
		Primes p3 = new Primes(4000001, 6000000);
		Primes p4 = new Primes(6000001, 8000000);
		Primes p5 = new Primes(8000001, 10000000);
		
		p1.calculate();
		p2.calculate();
		p3.calculate();
		p4.calculate();
		p5.calculate();
		
		int processedNumbers = p1.count() + p2.count() + p3.count() + p4.count() + p5.count();
		long t1 = (new Date().getTime());
		
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println("Prime numbers lesser than 10000000: " + nf.format(processedNumbers) + 
				" calculated in " + nf.format(t1 - t0) + " ms");
	
	}

}
