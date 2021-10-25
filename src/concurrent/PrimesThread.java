package concurrent;

public class PrimesThread extends Thread {
	private int _start, _end = 0;
	public static int _counter = 0;
	
	public PrimesThread(int x, int y) {
		_start = x;
		_end = y;
	}
	
	private boolean isPrime(int number) {
		int root = (int) Math.sqrt((double) number);
		for (int i = 2; i <= root; i++) {
			if (number % i == 0) return false;
		}
		return true;
	}
	
	@Override
	public void run() {
		for (int i = _start; i <= _end; i++) {
			if (isPrime(i)) _counter++;
		}
	}
	
	public static int count() { return _counter; }
}
