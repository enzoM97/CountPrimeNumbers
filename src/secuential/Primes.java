package secuential;

public class Primes {
	private int _start, _end, _counter = 0;
	
	public Primes(int x, int y) {
		_start = x;
		_end = y;
	}
	
	private boolean isPrime(int number) {
		int root = (int) Math.sqrt((double) number);
		for (int i = 2; i <= root; i++) {
			if (number % 2 == 0) return false;
		}
		return true;
	}
	
	public void calculate() {
		for (int i = _start; i <= _end; i++) {
			if (isPrime(i)) _counter++;
		}
	}
	
	public int count() { return _counter; }
}
